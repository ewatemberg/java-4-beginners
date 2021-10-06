public class Bike {

    // attributes
    private String brand;
    private int speed;

    // constructor
    public Bike(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // setters and getters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // for UI purposes I override the toString method
    @Override
    public String toString() {
        return "Bike [brand=" + brand + ", speed=" + speed + "]";
    }

    // custom methods

    public void increaseSpeed(int speed) {
        this.speed = this.speed + speed;
    }

    public void decreaseSpeed(int speed) {
        this.speed = this.speed - speed;
    }

}
