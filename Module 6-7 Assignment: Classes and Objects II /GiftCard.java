public class GiftCard extends Product {
    private String message;
    private double balance;

    // Constructor
    public GiftCard(String name, double price, String message, double balance) {
        super(name, price); // Call parent constructor
        this.message = message;
        this.balance = balance;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Message: \"" + message + "\", Balance: $" + balance;
    }
}
