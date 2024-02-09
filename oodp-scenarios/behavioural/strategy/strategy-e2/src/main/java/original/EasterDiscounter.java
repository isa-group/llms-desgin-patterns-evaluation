package original;

import java.math.BigDecimal;

public class EasterDiscounter  {
    
    public BigDecimal applyDiscount(final BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.5));
    }
}
