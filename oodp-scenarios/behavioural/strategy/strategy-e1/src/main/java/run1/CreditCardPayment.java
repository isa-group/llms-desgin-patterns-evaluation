package run1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import original.CreditCard;

public class CreditCardPayment implements PaymentMethod {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Enter the card number: ");
            String number = reader.readLine();
            System.out.print("Enter the card expiration date 'mm/yy': ");
            String date = reader.readLine();
            System.out.print("Enter the CVV code: ");
            String cvv = reader.readLine();
            card = new CreditCard(number, date, cvv);
            // Assume validation is done here
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (card != null) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            int currentAmount = card.getAmount();
            if (currentAmount >= paymentAmount) {
                card.setAmount(currentAmount - paymentAmount);
                return true;
            } else {
                System.out.println("Insufficient funds.");
                return false;
            }
        } else {
            return false;
        }
    }
}

