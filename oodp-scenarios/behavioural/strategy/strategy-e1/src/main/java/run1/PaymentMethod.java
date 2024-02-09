package run1;

public interface PaymentMethod {
    void collectPaymentDetails();
    boolean pay(int paymentAmount);
}