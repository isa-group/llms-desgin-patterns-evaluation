package run1;

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

