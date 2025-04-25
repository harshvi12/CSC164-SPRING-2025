public class GiftCard extends Product {
    private String message;
    private double balance;

    public GiftCard(String name, double price, String message, double balance) {
        super(name, price);
        this.message = message;
        this.balance = balance;
    }

    // Getters
    public String getMessage() {
        return message;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setMessage(String message) {
        this.message = message;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // toString
    public String toString() {
        return super.toString() + " | Gift Message: " + message + " | Balance: $" + balance;
    }
}
