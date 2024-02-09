package run1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayPalPayment implements PaymentMethod {
    private static final Map<String, String> DATABASE = new HashMap<>();
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn = false;

    static {
        DATABASE.put("amanda1985", "amanda@ya.com");
        DATABASE.put("qwerty", "john@amazon.eu");
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("Enter the user's email: ");
                email = reader.readLine();
                System.out.print("Enter the password: ");
                password = reader.readLine();
                if (verify()) {
                    System.out.println("Data verification has been successful.");
                    break;
                } else {
                    System.out.println("Wrong email or password!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        String expectedEmail = DATABASE.get(password);
        signedIn = expectedEmail != null && expectedEmail.equals(email);
        return signedIn;
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Paying " + paymentAmount + " using PayPal.");
            return true;
        } else {
            return false;
        }
    }
}
    

