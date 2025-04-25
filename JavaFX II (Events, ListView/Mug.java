public class Mug extends Product {
    private String color;
    private boolean isInsulated;

    public Mug(String name, double price, String color, boolean isInsulated) {
        super(name, price);
        this.color = color;
        this.isInsulated = isInsulated;
    }

    public String getColor() {
        return color;
    }

    public boolean isInsulated() {
        return isInsulated;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setInsulated(boolean insulated) {
        isInsulated = insulated;
    }

    public String toString() {
        return super.toString() + " | Color: " + color + " | Insulated: " + (isInsulated ? "Yes" : "No");
    }
}
