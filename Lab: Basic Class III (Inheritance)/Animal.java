public class Animal {
    private int age;

    // Constructor
    public Animal() {
        age = 0;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to increase age (birthday)
    public void birthday() {
        age++;
    }

    // Method to check if animal is old
    public boolean isOld() {
        return age > 10;
    }

    // Speak method
    public void speak() {
        System.out.println("This animal is making noises");
    }
}
