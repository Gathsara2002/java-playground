package advanced.raceCondition;

/**
 * @author : Gathsara
 * created : 1/24/2026 -- 7:37 PM
 **/

public class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}
