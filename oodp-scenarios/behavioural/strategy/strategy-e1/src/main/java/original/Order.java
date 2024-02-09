package original;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(CreditCardPayment cardPayment, PayPalPayment payPalPayment) {
        if(cardPayment!=null){
            cardPayment.collectPaymentDetails();
            cardPayment.charge(this.totalCost);
        } else {
            payPalPayment.collectCustomerData();
            payPalPayment.pay(this.totalCost);
        }        
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
