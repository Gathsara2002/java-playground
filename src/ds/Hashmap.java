package ds;

import java.util.HashMap;

/**
 * @author : Gathsara
 * created : 1/22/2026 -- 4:09 PM
 **/

public class Hashmap {
    public static void main(String[] args) {

        //HashMap - a data structure stores key value pairs.
        //Key must be uniques and value can be duplicate

        HashMap<Integer, String> map = new HashMap<>();

        //put values
        map.put(1,"Apple");
        map.put(2,"Orange");
        map.put(3,"Grapes");
        System.out.println(map);

        //remove
        map.remove(2);
        System.out.println(map);

        //get value
        System.out.println(map.get(3));

        //exist
        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Apple"));

        //duplicate
        Object clone = map.clone();
        System.out.println(clone);

        //clear map
        map.clear();
        System.out.println(map);
    }
}
