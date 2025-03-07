//  Cat.java
public class Cat {
    private String name; // Stores the cat's name
    private int age;     // Stores the cat's age

    // Default constructor (sets age to 0)
    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Overloaded constructor with parameters
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Check if the cat is old (older than 10 years)
    public boolean isOld() {
        return age > 10;
    }

    // Compare age with another cat
    public boolean sameAge(Cat anotherCat) {
        return this.age == anotherCat.getAge();
    }

    // Birthday method (increase age by 1)
    public void birthday() {
        age++;
    }
}
