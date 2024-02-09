# Strategy Scenario 2:

## Run data:

URL: https://chat.openai.com/share/ea2b946b-0679-4a44-95d7-541fea12d8fe

## Execution

### USER:

Given the following classes: 
```java
public class ChristmasDiscounter  {
    
    public BigDecimal computeReducedCost(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.9));
    }
 }

public class EasterDiscounter  {
    
    public BigDecimal applyDiscount(final BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.5));
    }
}

public class SpecialOffer {
    BigDecimal discount;
    public BigDecimal applyOffer(BigDecimal amount){
        return amount.multiply(discount);
    }
}

public class Order {
    Map<String, BigDecimal> items;
    
    public BigDecimal calculateTotal() {
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal value : items.values()) {
            sum = sum.add(value);
        }
        return sum;
    }

    public BigDecimal calculateTotalWithOffers(EasterDiscounter easterDiscounter, ChristmasDiscounter christmasDiscounter, SpecialOffer specialOffer) {
        BigDecimal total = calculateTotal();
        if(easterDiscounter != null) {
            total = easterDiscounter.applyDiscount(total);
        }else if(christmasDiscounter != null) {
            total = christmasDiscounter.computeReducedCost(total);  
        }else if(specialOffer != null) {
            total = specialOffer.applyOffer(total);
        }
        return total;
    }
}
```
How would you implement the capability of applying other types of offers (even multiple) to the same order and improve the code?

### ChatGPT

To implement the capability of applying multiple types of offers to the same order and to improve the code, we can leverage the Strategy Pattern and Polymorphism. The Strategy Pattern allows you to define a family of algorithms, encapsulate each one, and make them interchangeable. This pattern fits well here because it enables the flexibility to apply different discount strategies to an order.

Here's how you can refactor the code to incorporate this pattern:

1. **Define a Discount Strategy Interface**: This interface will declare a method that all discount strategies must implement to apply their discount to a given amount.

2. **Implement Discount Strategies**: Implement concrete classes for each discount strategy (e.g., Christmas, Easter, and Special Offer) that adhere to the Discount Strategy interface.

3. **Modify the Order Class**: Change the `calculateTotalWithOffers` method in the `Order` class to accept a list of discount strategies. The method will apply each strategy in sequence to the total amount.

Here is an example of how you could implement these changes:

```java
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

// Discount Strategy Interface
public interface DiscountStrategy {
    BigDecimal applyDiscount(BigDecimal amount);
}

// Christmas Discount Strategy
public class ChristmasDiscounter implements DiscountStrategy {
    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.9));
    }
}

// Easter Discount Strategy
public class EasterDiscounter implements DiscountStrategy {
    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.5));
    }
}

// Special Offer Discount Strategy
public class SpecialOffer implements DiscountStrategy {
    private final BigDecimal discount;

    public SpecialOffer(BigDecimal discount) {
        this.discount = discount;
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(discount);
    }
}

// Order class
public class Order {
    private final Map<String, BigDecimal> items;

    public Order(Map<String, BigDecimal> items) {
        this.items = items;
    }

    public BigDecimal calculateTotal() {
        return items.values().stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal calculateTotalWithOffers(List<DiscountStrategy> discountStrategies) {
        BigDecimal total = calculateTotal();
        for (DiscountStrategy strategy : discountStrategies) {
            total = strategy.applyDiscount(total);
        }
        return total;
    }
}
```

In this refactor:

- The `DiscountStrategy` interface defines a single method `applyDiscount`, which all discount strategies must implement.
- Each discount strategy (Christmas, Easter, Special Offer) implements the `DiscountStrategy` interface, providing their own implementation of `applyDiscount`.
- The `Order` class's `calculateTotalWithOffers` method now accepts a list of `DiscountStrategy` objects. It applies each strategy in sequence to the order's total amount.

This approach offers several benefits:
- **Extensibility**: It's easy to introduce new discount strategies without modifying existing code (other than adding the new strategy).
- **Flexibility**: Orders can now have multiple discounts applied in sequence.
- **Decoupling**: The `Order` class doesn't depend on concrete discount strategy implementations, only on the `DiscountStrategy` interface. This decoupling makes the system more flexible and easier to maintain.

To apply discounts, you would create instances of the discount strategies and pass them to the `calculateTotalWithOffers` method of an `Order` object as a list. This allows for the dynamic application of any number of discounts in any combination desired.

### User 
provide an example usage program

### ChatGPT

Here's an example program that demonstrates how to use the refactored classes to apply multiple discount offers to an order. This example creates an order with a few items, applies a combination of discounts (Easter, Christmas, and a special offer), and calculates the total amount after applying these discounts.

```java
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiscountApplicationExample {

    public static void main(String[] args) {
        // Create an order with some items
        Map<String, BigDecimal> items = new HashMap<>();
        items.put("Laptop", BigDecimal.valueOf(1000));
        items.put("Smartphone", BigDecimal.valueOf(500));
        Order order = new Order(items);

        // Create a list of discount strategies to apply
        List<DiscountStrategy> discountStrategies = new ArrayList<>();
        discountStrategies.add(new EasterDiscounter()); // 50% discount
        discountStrategies.add(new ChristmasDiscounter()); // 10% discount on the reduced price
        discountStrategies.add(new SpecialOffer(BigDecimal.valueOf(0.8))); // Additional 20% discount on the further reduced price

        // Calculate total with discounts applied
        BigDecimal totalWithDiscounts = order.calculateTotalWithOffers(discountStrategies);

        // Print the original total and the total after discounts
        System.out.println("Original Total: " + order.calculateTotal());
        System.out.println("Total with Discounts: " + totalWithDiscounts);
    }
}
```

This example performs the following steps:

1. **Create Items for the Order**: It initializes a `Map<String, BigDecimal>` with two items, a laptop and a smartphone, with their respective prices.

2. **Instantiate the Order**: Creates an `Order` object using the items map.

3. **Prepare Discount Strategies**: It creates a `List<DiscountStrategy>` and adds three discount strategies to it: `EasterDiscounter` for a 50% discount, `ChristmasDiscounter` for a 10% discount on the already reduced price, and `SpecialOffer` for an additional 20% discount on the further reduced price.

4. **Calculate and Print Totals**: Calculates the order's total first without any discounts, then with all the discounts applied in sequence. Finally, it prints both totals to compare them.

This program showcases how you can combine multiple discount strategies flexibly and apply them to an order. The key advantage of this approach is its extensibility, allowing for easy addition of new discount types without modifying the core logic of the `Order` class or existing discount strategies.

## Evaluation and Discussion

In this case we have specified the need of creating a way to apply different discounts to the same order.  The LLM identified the opportunity of applying the design pattern proactively providing a valid implementation.



