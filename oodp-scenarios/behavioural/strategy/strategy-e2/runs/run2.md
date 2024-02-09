# Strategy Scenario 2:

## Run data:

URL: https://chat.openai.com/share/845b4e83-b2d4-40c7-9d4a-0a0d06c0a47c

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

To enhance the flexibility and maintainability of applying various types of discounts or offers to an order, and even allowing for the application of multiple offers to the same order, we can use the Strategy Pattern. The Strategy Pattern enables the selection of algorithms at runtime. Here, each discount type can be seen as a strategy for reducing the cost of an order.

First, define an interface that represents a discount strategy. Each discounter class will implement this interface. This approach decouples the order calculation logic from the specific discount algorithms and adheres to the Open/Closed Principle, making the system more flexible and extensible.

### Step 1: Define the Discount Strategy Interface

```java
import java.math.BigDecimal;

public interface DiscountStrategy {
    BigDecimal applyDiscount(BigDecimal amount);
}
```

### Step 2: Implement the Discount Strategies

Adjust the existing discounter classes to implement the new `DiscountStrategy` interface. Note that we'll also adjust the method name to `applyDiscount` for consistency.

```java
public class ChristmasDiscounter implements DiscountStrategy {

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.9));
    }
}

public class EasterDiscounter implements DiscountStrategy {

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.5));
    }
}

public class SpecialOffer implements DiscountStrategy {
    BigDecimal discount;

    public SpecialOffer(BigDecimal discount) {
        this.discount = discount;
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(discount);
    }
}
```

### Step 3: Modify the Order Class to Use Discount Strategies

Modify the `Order` class to accommodate an arbitrary number of discount strategies. You can use a list to store these strategies and apply them sequentially to the order total.

```java
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Order {
    Map<String, BigDecimal> items;
    List<DiscountStrategy> discountStrategies = new ArrayList<>();

    public void addDiscountStrategy(DiscountStrategy discountStrategy) {
        discountStrategies.add(discountStrategy);
    }

    public BigDecimal calculateTotal() {
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal value : items.values()) {
            sum = sum.add(value);
        }
        return sum;
    }

    public BigDecimal calculateTotalWithDiscounts() {
        BigDecimal total = calculateTotal();
        for (DiscountStrategy discountStrategy : discountStrategies) {
            total = discountStrategy.applyDiscount(total);
        }
        return total;
    }
}
```

### Benefits of This Approach:

- **Extensibility**: It's easy to introduce new discount strategies without modifying existing code, adhering to the Open/Closed Principle.
- **Flexibility**: Multiple discounts can be applied to an order. The order of application can affect the final price, offering flexibility in how discounts are compounded.
- **Decoupling**: The `Order` class doesn't depend on concrete discount implementations, only the `DiscountStrategy` interface.

This design allows for the easy addition of new discount types and the application of multiple discounts to the same order, greatly improving the code's flexibility and maintainability.

### User

provide an example usage program

### ChatGPT

Let's create an example program that demonstrates how to use the modified `Order` class along with the `DiscountStrategy` implementations. In this program, we will:

1. Create an order with several items.
2. Apply different discount strategies (Easter, Christmas, and a special offer).
3. Calculate the total price before and after applying the discounts.

### Example Program

```java
import java.math.BigDecimal;
import java.util.HashMap;

public class DiscountApplicationExample {

    public static void main(String[] args) {
        // Create an order and add some items
        Order order = new Order();
        order.items = new HashMap<>();
        order.items.put("Laptop", BigDecimal.valueOf(1000));
        order.items.put("Smartphone", BigDecimal.valueOf(500));

        // Display the total before discounts
        System.out.println("Total before discounts: " + order.calculateTotal());

        // Apply different discount strategies
        DiscountStrategy easterDiscount = new EasterDiscounter();
        DiscountStrategy christmasDiscount = new ChristmasDiscounter();
        DiscountStrategy specialOffer = new SpecialOffer(BigDecimal.valueOf(0.8)); // 20% off special offer

        order.addDiscountStrategy(easterDiscount);
        order.addDiscountStrategy(christmasDiscount);
        order.addDiscountStrategy(specialOffer);

        // Calculate and display the total after applying the discounts
        BigDecimal totalWithDiscounts = order.calculateTotalWithDiscounts();
        System.out.println("Total after discounts: " + totalWithDiscounts);
    }
}
```

### Explanation

- **Creating Order and Adding Items**: Initially, we instantiate an `Order` object and populate it with items, assigning prices to each.
- **Applying Discounts**: We then instantiate each discount strategy (Easter, Christmas, and a Special Offer) and add these strategies to the order. This demonstrates the flexibility of the approach, as we can easily apply any combination of discounts.
- **Calculating Totals**: We calculate the total price of the order both before and after applying the discounts to see the effect of the discount strategies.

This example showcases how to use the strategy pattern for applying discounts in a flexible and extensible manner. By adding or removing discount strategies from the `Order` object, you can easily adjust how discounts are applied to the order total.

## Evaluation and Discussion

In this case the result is exactly the same as in run 1, proactive identification and correct implementation.


