package dkalymbaev.counter;

/**
 * Created by User on 28.12.2016.
 */
public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for(int index = start; index <= finish; index++) {
            if (index == 0) {
                sum = sum - 10;
            } else if (index % 2 != 0) {
                sum = sum + (index - 1);
            } else if (index % 2 == 0) {
                sum = sum + index * 2;
            }
        }return sum;
    }
}