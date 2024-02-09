package run2;

public interface Payment {
    void collectPaymentDetails(); // Collect payment information
    boolean pay(int paymentAmount); // Process the payment
}
