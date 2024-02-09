package run2;

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
