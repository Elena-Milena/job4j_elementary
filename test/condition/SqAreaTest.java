package condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenSquare6And2() {
        int in = 6;
        int in2 = 2;
        double expected = 2.0;
        double out = SqArea.square(in, in2);
        Assert.assertEquals(out, expected, 0.01);
    }
}