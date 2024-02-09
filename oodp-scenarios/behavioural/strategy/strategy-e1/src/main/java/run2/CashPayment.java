package run2;

public class CashPayment implements Payment {
    private int paymentAmount;

    @Override
    public void collectPaymentDetails() {
        // Simulate collecting cash details
        System.out.println("Cash payment selected. Please proceed to the cashier.");
        // In a real application, details like paymentAmount would be set here
    }

    @Override
    public boolean pay(int paymentAmount) {
        this.paymentAmount = paymentAmount; // Assuming the cash amount covers the payment
        System.out.println("Paying " + paymentAmount + " using Cash.");
        return true;
    }
}
