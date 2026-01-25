package ds;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Gathsara
 * created : 1/25/2026 -- 7:51 PM
 **/

public class Hashset {
    public static void main(String[] args) {

        //Hashset -  work same as ArrayList but doesn't approve duplicate values

        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(345);
        set.add(4124);
        set.add(10);

        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
