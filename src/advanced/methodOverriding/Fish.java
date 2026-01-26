package advanced.methodOverriding;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 10:04 AM
 **/

public class Fish extends Animal{

    @Override
    void move(){
        System.out.println("Swimming");
    }
}
