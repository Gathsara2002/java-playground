package advanced.intro;

/**
 * @author : Gathsara
 * created : 1/17/2026 -- 3:20 PM
 **/

public class Main {
    public static void main(String[] args) {

        //Object Oriented Programming

        //Object - a real world entity
        //Object hold data (attributes) and perform actions (behaviours)
        //Object is a reference data type

        //Create object
        Car car = new Car();

        //Access attributes in the car object
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        //Access behaviours
        car.start();
        car.stop();
    }
}
