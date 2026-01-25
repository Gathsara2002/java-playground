package ds;

import java.util.TreeSet;

/**
 * @author : Gathsara
 * created : 1/25/2026 -- 8:00 PM
 **/

public class Treeset {
    public static void main(String[] args) {

        //TreeSet - work as hash set but return sorted

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(12);
        treeSet.add(23);
        treeSet.add(67);
        treeSet.add(30);

        System.out.println(treeSet);
    }
}
