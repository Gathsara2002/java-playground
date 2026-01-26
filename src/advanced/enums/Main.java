package advanced.enums;

/**
 * @author : Gathsara
 * created : 1/22/2026 -- 4:20 PM
 **/

public class Main {
    public static void main(String[] args) {

        //Enums - special class for store constant values
        //Efficient when working with switch

        Day day = Day.MONDAY;
        System.out.println(day);
        System.out.println(day.getDayNumber());

        switch (day.getDayNumber()) {
            case 1 -> System.out.println("This is monday");
            case 2 -> System.out.println("This is tuesday");
            case 3 -> System.out.println("This is wednesday");
            case 4 -> System.out.println("This is thursday");
            case 5 -> System.out.println("This is friday");
            case 6 -> System.out.println("This is saturday");
            case 7 -> System.out.println("This is sunday");
            default -> System.out.println("Not a day");
        }
    }
}
