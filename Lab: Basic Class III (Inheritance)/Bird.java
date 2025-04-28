public class Bird extends Animal {
    private int altitude;

    // Constructor
    public Bird() {
        super(); // call Animal's constructor
        altitude = 0;
    }

    // Getter for altitude
    public int getAltitude() {
        return altitude;
    }

    // Setter for altitude
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    // Override the speak method
    @Override
    public void speak() {
        System.out.println("Tweet tweet");
    }
}
