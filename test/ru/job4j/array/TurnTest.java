package ru.job4j.array;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import junit.framework.TestCase;
import org.junit.Test;

public class TurnTest extends TestCase {
    @Test
    public void testWhenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
      Turn turner = new Turn();
      int[] input = new int[] {4, 1, 6, 2};
      int[] result = turner.back(input);
      int[] expected = new int[] { 2, 6, 1, 4};
      assertThat(result, is(expected));
    }
    @Test
    public void testWhenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = turner.back(input);
        int[] expected = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }
}