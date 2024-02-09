package original;

import java.math.BigDecimal;

public class ChristmasDiscounter  {
    
    public BigDecimal computeReducedCost(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.9));
    }
 }