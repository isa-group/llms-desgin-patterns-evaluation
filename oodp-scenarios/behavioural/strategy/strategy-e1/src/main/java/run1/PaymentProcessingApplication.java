package run1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



    
public class PaymentProcessingApplication {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Welcome to the Payment Processing Application");

        // Create an order and set its total cost
        Order order = new Order();
        order.setTotalCost(500); // Setting the order cost to 500 for demonstration

        System.out.println("Please select a payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Cash");
        System.out.print("Enter your choice (1-3): ");
        
        String choice = reader.readLine();
        PaymentMethod paymentMethod = null;

        switch (choice) {
            case "1":
                paymentMethod = new CreditCardPayment();
                break;
            case "2":
                paymentMethod = new PayPalPayment();
                break;
            case "3":
                paymentMethod = new CashPayment();
                break;
            default:
                System.out.println("Invalid choice, exiting application.");
                return;
        }

        // Process the order with the selected payment method
        order.processOrder(paymentMethod);

        if (order.isClosed()) {
            System.out.println("Thank you for your payment. Your order has been processed successfully.");
        } else {
            System.out.println("There was an issue processing your payment. Please try again.");
        }
    }
}

