package ru.job4j.array.ru.job4j.array;

import junit.framework.TestCase;
import ru.job4j.array.Matrix;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class MatrixCheckTest extends TestCase {

    public void testMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }
    public void testWhenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }
    public void testWhenDiagonal() {
     char[][] input = {
             {'X', ' ', ' '},
             {' ', 'X', ' '},
             {' ', ' ', 'X'}
     };
     char[] result = MatrixCheck.extractDiagonal(input);
     char[] expect = {'X', 'X', 'X'};
     assertThat(result, is(expect));
    }
}