public class ATMMain {
    public static void main(String[] args) {
        // Create a sample user (for simplicity)
        User user = new User("user123", "1234", 1000.0);

        // Initialize ATM and start
        ATM atm = new ATM(user);
        atm.start();
    }
}