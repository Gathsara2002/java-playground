package advanced.forEach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author : Gathsara
 * created : 1/26/2026 -- 4:48 PM
 **/

public class Main {
    public static void main(String[] args) {

        //forEach() - this is short hand for traditional enhanced for loop. forEach() need consumer object to work.

        List<Integer> nums = Arrays.asList(2, 35, 67, 21, 89);

        //Anonymous inner class
        Consumer<Integer> consumer1 = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        };

        nums.forEach(consumer1);


        //Lambda expression
        Consumer<Integer> consumer2 = (Integer n)->{
            System.out.println(n);
        };

        nums.forEach(consumer2);


        //In one line
        nums.forEach(n-> System.out.println(n));
    }
}
