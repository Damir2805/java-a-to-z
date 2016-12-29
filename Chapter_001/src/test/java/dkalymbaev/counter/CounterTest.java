package dkalymbaev.counter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by User on 28.12.2016.
 */
public class CounterTest {
    /**
     * This test checks incremental sum.
     */
    @Test
    public void whenIncCounted() {
        Counter count = new Counter();
        int result = count.add(3, 5);
        assertThat(result, is(5));
    }
}