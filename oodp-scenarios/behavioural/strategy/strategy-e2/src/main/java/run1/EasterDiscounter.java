package run1;

import java.math.BigDecimal;

public class EasterDiscounter implements DiscountStrategy {
    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.5));
    }
}
