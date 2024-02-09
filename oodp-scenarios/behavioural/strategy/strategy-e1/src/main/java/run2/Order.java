package run2;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(Payment paymentMethod) {
        if (paymentMethod != null) {
            paymentMethod.collectPaymentDetails();
            if (paymentMethod.pay(this.totalCost)) {
                System.out.println("Payment successful.");
                this.isClosed = true;
            } else {
                System.out.println("Payment failed.");
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