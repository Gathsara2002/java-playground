package advanced.wrapperClass;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 3:42 PM
 **/

public class Main {
    public static void main(String[] args) {

        //Wrapper classes - allow primitive data to be used as objects
        //Allows to access collection framework

        //int a = 23;
        //Integer a = new Integer(23);  //deprecated
        Integer a = 23;

        //double b =12.2;
        //Double b = new Double(12.2);
        Double b = 12.2;

        //Boxing - convert primitive value to wrapper
        Character c = '@';
        Boolean d = true;

        //Unboxing - convert wrapper class into primitive value
        boolean x = d;
        char y = c;
    }
}
