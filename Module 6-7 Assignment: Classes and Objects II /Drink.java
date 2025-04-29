public class Drink extends Product {
    private int calories;
    private int sugar;
    private int fat;
    private String size;

    // Constructor
    public Drink(String name, double price, int calories, int sugar, int fat, String size) {
        super(name, price); // Call parent constructor
        this.calories = calories;
        this.sugar = sugar;
        this.fat = fat;
        this.size = size;
    }

    // Getters and Setters
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Calories: " + calories + ", Sugar: " + sugar + "g, Fat: " + fat + "g, Size: " + size;
    }
}
