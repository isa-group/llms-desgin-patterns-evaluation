package run1;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

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