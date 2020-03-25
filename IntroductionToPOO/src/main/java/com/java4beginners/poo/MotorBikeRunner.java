package main.java.com.java4beginners.poo;

/**
 * Write a description of class MotorBikeRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MotorBikeRunner {

    public static void main(String[] args) {

        MotorBike ducati = new MotorBike(100);

        MotorBike honda = new MotorBike(200);

        MotorBike somethingElse = new MotorBike();

        System.out.println(ducati.getSpeed());

        System.out.println(honda.getSpeed());

        System.out.println(somethingElse.getSpeed());

        ducati.start();

        honda.start();

        //ducati.setSpeed(100);

        ducati.increaseSpeed(100);

        honda.increaseSpeed(100);

        ducati.decreaseSpeed(250);

        honda.decreaseSpeed(250);

        System.out.println(ducati.getSpeed());

        System.out.println(honda.getSpeed());
    }

}