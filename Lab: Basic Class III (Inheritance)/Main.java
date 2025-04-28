public class Main {
    public static void main(String[] args) {
        
        // Create a Cat object
        Cat myCat = new Cat();
        myCat.setAge(3); // Setting the age
        myCat.speak(); // Should print "Meow"
        System.out.println("Is the cat old? " + myCat.isOld()); // false
        
        // Create a Bird object
        Bird myBird = new Bird();
        myBird.setAge(12); // Setting the age
        myBird.setAltitude(100); // Setting the altitude
        myBird.speak(); // Should print "Tweet tweet"
        System.out.println("Is the bird old? " + myBird.isOld()); // true

        // Print the bird's altitude
        System.out.println("Bird is flying at " + myBird.getAltitude() + " meters.");
    }
}
