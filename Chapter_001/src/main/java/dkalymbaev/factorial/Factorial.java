package dkalymbaev.factorial;

/**
 * Created by User on 29.12.2016.
 */
public class Factorial {
    public int mult(int start, int finish) {
        int result = 1;
        if (result < 0) {

        } else if (result == 0) {
            
        } else {
            for(int index = start; index <= finish; index++) {
                result *= index;
            }
        }
        return result;
    }
}
