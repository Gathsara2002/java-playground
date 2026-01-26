package advanced.oop.abstraction;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 11:22 AM
 **/

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
