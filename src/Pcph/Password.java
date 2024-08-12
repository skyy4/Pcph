package Pcph;

import java.util.Optional;

public class Password {
    public static void main(String[] args) {
        String password = "YourPassword123!"; // Replace with user input

        if (isValidPassword(password)) {
            System.out.println("Valid password!");
        } else {
            System.out.println("Invalid password. Please follow the rules.");
        }
    }

    public static boolean isValidPassword(String password) {
        return Optional.ofNullable(password)
                .filter(p -> p.length() >= 5)
                .filter(p -> p.matches(".*[A-Z].*"))
                .filter(p -> p.matches(".*[a-z].*"))
                .filter(p -> p.matches(".*[!@#$%^&*()-+=].*"))
                .filter(p -> p.matches(".*\\d.*"))
                .isPresent();
    }
}
