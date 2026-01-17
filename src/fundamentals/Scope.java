package fundamentals;

/**
 * @author : Gathsara
 * created : 1/16/2026 -- 5:14 PM
 **/

public class Scope {

    static int y = 3; //Class - declare inside class

    public static void main(String[] args) {

        // variable scope - where can variable access

        //1.Local - declare inside method
        int x = 1;
        System.out.println(x);
        System.out.println(y);

        sample();

    }

    static void sample() {
        int x = 2;  //Local
        System.out.println(x);
        System.out.println(y);
    }

    //Local variables can be used inside the method it declares
    //Class variables can be used inside anywhere of the declared class
}
