package dkalymbaev.factorial;

/**
 * Created by User on 29.12.2016.
 */
public class Factorial {
    public int mult(int start, int finish) {
        int multiple = 1;
        for(int index = start; index <= finish; index++) {
            multiple *= index;
        } return multiple;
    }
}
