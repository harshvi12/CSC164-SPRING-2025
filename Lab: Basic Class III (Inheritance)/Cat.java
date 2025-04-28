public class Cat extends Animal {

    // Constructor
    public Cat() {
        super(); // call Animal's constructor
    }

    // Override the speak method
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
