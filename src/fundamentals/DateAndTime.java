package fundamentals;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author : Gathsara
 * created : 1/20/2026 -- 4:12 PM
 **/

public class DateAndTime {
    public static void main(String[] args) {

        LocalDate date=LocalDate.now();
        System.out.println(date);

        LocalTime time= LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime= LocalDateTime.now();
        System.out.println(dateTime);

        Instant instant= Instant.now();
        System.out.println(instant);
    }
}
