package main.java.com.java4beginners.poo;

/**
 * Write a description of class MotorBike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MotorBike {

    //state
    private int speed; //member variable

    //constructors
    MotorBike() {
        this(5);
    }

    MotorBike(int speed) {
        this.speed = speed;
    }

    //behavior
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0)
            this.speed = speed;
    }

    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
    }

    void start() {
        System.out.println("Bike Started");
    }

}
