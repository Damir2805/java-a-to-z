package dkalymbaev.counter;

/**
 * Created by User on 28.12.2016.
 */
public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for(int index = start; index <= finish; index++) {
            sum += index;
        }
        return sum;
    }
}