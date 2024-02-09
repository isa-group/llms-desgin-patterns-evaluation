package run2;

import java.util.Scanner;

public class PaymentSystemDemo {

    public static void main(String[] args) {
        // Create an order and set its total cost
        Order order = new Order();
        order.setTotalCost(50000); // Setting the total cost of the order to 50,000 units

        // Simulate user choosing a payment method
        System.out.println("Choose a payment method: 1) Credit Card 2) PayPal 3) Cash");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        Payment paymentMethod = null;

        switch (choice) {
            case 1:
                // User chooses Credit Card
                paymentMethod = new CreditCardPayment();
                break;
            case 2:
                // User chooses PayPal
                paymentMethod = new PayPalPayment();
                break;
            case 3:
                // User chooses Cash
                paymentMethod = new CashPayment();
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                System.exit(1);
        }

        // Process the order with the chosen payment method
        order.processOrder(paymentMethod);

        if (order.isClosed()) {
            System.out.println("Order has been processed and is now closed.");
        } else {
            System.out.println("Order processing failed.");
        }

        scanner.close();
    }
}

