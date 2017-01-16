package dkalymbaev.piramid;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by User on 11.01.2017.
 */
public class PiramidTest {
    /**
     * This class checks if piramid is builded correctly.
     */
    @Test
    public void whenPiramidIsBuilded() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Piramid.main(null);
        assertThat(out.toString(), is("    ^    \r\n   ^^^   \r\n  ^^^^^  \r\n ^^^^^^^ \r\n^^^^^^^^^\r\n"));
    }
}
