package ds;

import java.util.ArrayList;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 3:53 PM
 **/

public class Arraylist {
    public static void main(String[] args) {

        //ArrayList - resizable array that store objects

        ArrayList<Integer> list = new ArrayList<>();

        //add objects
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(11);
        System.out.println(list);  //In here display the elements instead of memory address because ArrayList has customized toString() instead of default.

        //remove element
        list.remove(2);
        System.out.println(list);

        //get element
        System.out.println(list.get(1));

    }
}
