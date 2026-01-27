package advanced.var;

import java.util.ArrayList;

/**
 * @author : Gathsara
 * created : 1/27/2026 -- 4:25 PM
 **/

public class Main {
    public static void main(String[] args) {

        //Var - Local Variable Type Inference. It allows  to stop explicitly typing out the class name on the left side
        // of variable declaration, letting the compiler "guess" (infer) the type based on what you are assigning to it.
        //Only can use for local variables

        int a = 8;

        var b = 9;

        var sb = new StringBuffer("Hi");

        var list = new ArrayList<Integer>();
        list.add(198);
        list.add(87);
        list.add(256);
        list.add(45);

        System.out.println(a);
        System.out.println(b);
        System.out.println(sb);
        System.out.println(list);
    }
}
