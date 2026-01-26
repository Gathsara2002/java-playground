package advanced.lambda;

/**
 * @author : Gathsara
 * created : 1/22/2026 -- 2:45 PM
 **/

public class Main {
    public static void main(String[] args) {

        //Lambda expression - lambda expression is a concise way to represent anonymous inner class.
        //Lambda express is work only with functional interfaces.

        A a = new A() {
            @Override
            public void show() {
                System.out.println("This is anonymous inner class");
            }
        };
        a.show();

        A a1 = () -> {
            System.out.println("This is lambda expression");
        };
        a1.show();

        B b = (int i) -> {
            System.out.println("This is interface B " + 5);
        };
        b.display(5);

        C c = (int num1, int num2) -> {
            return num1 + num2;
        };
        System.out.println(c.sum(4, 5));
    }
}
