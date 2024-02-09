package run1;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PaymentMethod paymentMethod) {
        if(paymentMethod != null){
            paymentMethod.collectPaymentDetails();
            if(paymentMethod.pay(this.totalCost)){
                this.isClosed = true;
            }
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