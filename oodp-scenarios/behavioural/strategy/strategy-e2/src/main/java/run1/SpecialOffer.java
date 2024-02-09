package run1;

import java.math.BigDecimal;

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
