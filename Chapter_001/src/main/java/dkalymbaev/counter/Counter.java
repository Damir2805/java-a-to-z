package dkalymbaev.counter;

/**
 * Created by User on 28.12.2016.
 */
public class Counter {
    public int add(int start, int finish) {
        for(int index = start; index <= finish; index++) {
            System.out.println(index);
        }
        return finish;
    }
}