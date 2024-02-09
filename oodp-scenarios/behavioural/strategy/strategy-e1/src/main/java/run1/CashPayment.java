package run1;

public class CashPayment implements PaymentMethod {
    @Override
    public void collectPaymentDetails() {
        // In case of cash, there might not be any details to collect beforehand.
        System.out.println("No payment details required for cash payment.");
    }

    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("Paying " + paymentAmount + " using cash.");
        // Here you can implement logic specific to cash payment, if necessary.
        return true; // Assuming the cash payment is always successful.
    }
}
