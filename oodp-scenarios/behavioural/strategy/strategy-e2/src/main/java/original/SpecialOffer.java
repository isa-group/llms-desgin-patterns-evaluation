package original;

import java.math.BigDecimal;

public class SpecialOffer {
    BigDecimal discount;
    public BigDecimal applyOffer(BigDecimal amount){
        return amount.multiply(discount);
    }
}
