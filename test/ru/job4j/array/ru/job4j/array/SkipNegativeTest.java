package ru.job4j.array.ru.job4j.array;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import junit.framework.TestCase;

public class SkipNegativeTest extends TestCase {

    public void testSkip() {
        int[][] in = {
                {1, -2},
                {1, 2}
        };
        int[][] expect = {
                {1, 0},
                {1, 2}
        };
        int[][] result = SkipNegative.skip(in);
        assertThat(result, is(expect));
    }
}