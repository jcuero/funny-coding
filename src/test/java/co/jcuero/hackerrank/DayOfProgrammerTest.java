package co.jcuero.hackerrank;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author <a href="https://github.com/jcuero">Jose Fary Hurtado Cuero</a>
 * @since 08 nov. 2020
 */
public class DayOfProgrammerTest {


    @Test
    public void test() {
        int year = 2;

        String result = DayOfProgrammer.dayOfProgrammer(year);

        Assert.assertEquals("Cat B", result);
    }

}