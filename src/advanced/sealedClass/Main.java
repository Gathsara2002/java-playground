package advanced.sealedClass;

/**
 * @author : Gathsara
 * created : 1/27/2026 -- 4:39 PM
 **/

public class Main {
    public static void main(String[] args) {

        //Sealed class - is a way for you to restrict which other classes can extend it.
        //Add sealed keyword to parent class and use permit keyword to define classes need to be inherited.
        //Make child class either final, sealed or non-sealed.

        A b = new B();
    }
}
