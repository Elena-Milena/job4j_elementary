package ru.job4j.array;

import junit.framework.TestCase;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class MatrixTest extends TestCase {

    public void testWhen2on2() {
        int[][] table = Matrix.multiple(2);
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expected));
    }
}