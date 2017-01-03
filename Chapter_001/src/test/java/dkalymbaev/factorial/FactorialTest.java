package dkalymbaev.factorial;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by User on 29.12.2016.
 */
public class FactorialTest {
    /**
     * This test checks multiple multiplication such as factorials.
     */
    @Test
    public void whenMultiplicatedAndCounted() {
        Factorial fact = new Factorial();
        int result = fact.mult(1, 3);
        assertThat(result, is(6));
    }
}
