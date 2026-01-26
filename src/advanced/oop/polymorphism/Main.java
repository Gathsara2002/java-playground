package advanced.oop.polymorphism;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 12:41 PM
 **/

public class Main {
    public static void main(String[] args) {

        //Polymorphism - single interface many forms (It is the ability of an object or a method to take on multiple forms)

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = bike;
        vehicles[2] = boat;

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
