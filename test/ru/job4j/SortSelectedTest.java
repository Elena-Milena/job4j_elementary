package ru.job4j;

import junit.framework.TestCase;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class SortSelectedTest extends TestCase {

    public void testSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expected));
    }
}