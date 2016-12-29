package dkalymbaev.counter;

/**
 * Created by User on 28.12.2016.
 */
public class Counter {
    private int start;
    private int finish;
    private int result;

    public int add() {
        for (start = 0; start < finish; start++) {
            if (start % 2 == 0) {
                this.result = start + finish;
            }
            return result;
        }
        return finish;
    }
}
