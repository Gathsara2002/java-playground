/**
 * @author : Gathsara
 * created : 1/16/2026 -- 4:16 PM
 **/

public class NestedLoops {
    public static void main(String[] args) {

        //Nested loops - loop inside another loop

        OUTER_LOOP:
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j == 5) {
                    continue;
                }
                if (i == 1) {
                    continue OUTER_LOOP;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
