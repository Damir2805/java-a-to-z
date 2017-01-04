package dkalymbaev.factorial;

/**
 * Created by User on 29.12.2016.
 */
public class Factorial {
    public int mult(int finish) {
        int result = 1;
        if (finish < 0) {
            result = 0;
        } else if (finish == 0) {
            result = 1;
        } else {
            for(int index = 1; index <= finish; index++) {
                result *= index;
            }
        }
        return result;
    }
}
