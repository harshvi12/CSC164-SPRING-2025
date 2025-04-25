public class Drink extends Product {
    private int calories;
    private int sugar; // grams
    private int fat;   // grams
    private String size; // Small, Medium, Large

    public Drink(String name, double price, int calories, int sugar, int fat, String size) {
        super(name, price);
        this.calories = calories;
        this.sugar = sugar;
        this.fat = fat;
        this.size = size;
    }

    // Getters
    public int getCalories() {
        return calories;
    }

    public int getSugar() {
        return sugar;
    }

    public int getFat() {
        return fat;
    }

    public String getSize() {
        return size;
    }

    // Setters
    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // toString
    public String toString() {
        return super.toString() + " | Size: " + size + " | Calories: " + calories + " | Sugar: " + sugar + "g | Fat: " + fat + "g";
    }
}
