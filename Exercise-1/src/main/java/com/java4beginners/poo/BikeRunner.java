public class BikeRunner {

    public static void main(String[] args) {

        // Create Honda bike with speed of 100
        Bike honda = new Bike("Honda", 100);
        System.out.println(honda.toString()); // Bike [brand=Honda, speed=100]

        // Create Yamaha bike with speed of 200
        Bike yamaha = new Bike("Yamaha", 200);
        System.out.println(yamaha.toString()); // Bike [brand=Yamaha, speed=200]

        // Increase the speed of the Honda bike by 20
        honda.increaseSpeed(20);
        System.out.println(honda.toString()); // Bike [brand=Honda, speed=120]

        // Decrease the speed of the Yamaha bike by 50
        yamaha.decreaseSpeed(50);
        System.out.println(yamaha.toString()); // Bike [brand=Honda, speed=150]

        // Simulate a race between bikes
        System.out.println(race(yamaha, honda)); // Winner Yamaha

    }

    public static String race(Bike bike1, Bike bike2) {
        if (bike1.getSpeed() > bike2.getSpeed()) {
            return "Winner " + bike1.getBrand();
        } else {
            if (bike2.getSpeed() > bike1.getSpeed()) {
                return "Winner " + bike2.getBrand();
            } else {
                return "Tie";
            }
        }
    }

}
