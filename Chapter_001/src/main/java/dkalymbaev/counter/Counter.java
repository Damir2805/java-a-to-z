package dkalymbaev.counter;

/**
 * Created by User on 28.12.2016.
 */
public class Counter {
    private int start;
    private int finish;
    private int result;

    public int add() {
        int a = start++;
        if ((start + a) % 2 == 0) {
            this.result = start + a;
            return result;
        } else if (start + a >= finish) {
            return 0;
        }
        return finish;
    }
}
