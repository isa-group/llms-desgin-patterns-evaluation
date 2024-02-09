package original;

import java.math.BigDecimal;
import java.util.Map;

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
