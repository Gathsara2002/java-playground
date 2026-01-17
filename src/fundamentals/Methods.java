package fundamentals;

/**
 * @author : Gathsara
 * created : 1/16/2026 -- 4:34 PM
 **/

public class Methods {
    public static void main(String[] args) {

        //fundamentals.Methods - Reusable block of code which only run when it's called
        //Cannot define method inside another method because java doesn't support nested methods
        //Method signature - method name + parameters
        // Method overloading - same name but different parameter methods. (consider only method signature)

        subMethod1();
        subMethod2("Hello");
        System.out.println(subMethod3());
        System.out.println(subMethod4("Hi"));
        System.out.println(subMethod4(1));
    }

    static void subMethod1() {
        System.out.println("This is method do not return value and do not accept argument");
    }

    static void subMethod2(String param) {
        System.out.println(param + " :This is method do not return value but accept one argument");
    }

    static String subMethod3() {
        return "This is method  return value and do not accept argument";
    }

    static String subMethod4(String param) {
        return param+ " :This is method  return value and accept one argument";
    }

    static String subMethod4(int param) {
        return param+ " : method overloading";
    }

}
