package run2;

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
