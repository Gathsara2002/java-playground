package advanced.oop.abstraction;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 11:22 AM
 **/

public class Triangle extends Shape {

    double height;
    double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        return 0.5*base*height;
    }
}
