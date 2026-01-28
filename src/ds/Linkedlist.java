package ds;

import java.util.LinkedList;

/**
 * @author : Gathsara
 * created : 1/28/2026 -- 8:54 PM
 **/

public class Linkedlist {
    public static void main(String[] args) {

        //LinkedList - same as ArrayList. However instead of array LinkedList use containers to store data

        LinkedList<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(11);
        list.add(67);
        list.add(80);
        list.add(104);
        System.out.println(list);

        LinkedList<Integer> reversed = list.reversed();
        System.out.println(reversed);
    }
}
