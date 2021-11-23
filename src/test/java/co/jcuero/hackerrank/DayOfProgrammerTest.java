package co.jcuero.hackerrank;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author <a href="https://github.com/jcuero">Jose Fary Hurtado Cuero</a>
 * @since 08 nov. 2020
 */
public class DayOfProgrammerTest {


    @Test
    public void test_2017() {
        int year = 2017;

        String result = DayOfProgrammer.dayOfProgrammer(year);

        Assert.assertEquals("13.09.2017", result);
    }

    @Test
    public void test_2016() {
        int year = 2016;

        String result = DayOfProgrammer.dayOfProgrammer(year);

        Assert.assertEquals("12.09.2016", result);
    }

    @Test
    public void test_1984() {
        int year = 1984;

        String result = DayOfProgrammer.dayOfProgrammer(year);

        Assert.assertEquals("12.09.1984", result);
    }

    @Test
    public void test_1800() {
        int year = 1800;

        String result = DayOfProgrammer.dayOfProgrammer(year);

        Assert.assertEquals("12.09.1800", result);
    }

    @Test
    public void test_1918() {
        int year = 1918;

        String result = DayOfProgrammer.dayOfProgrammer(year);

        Assert.assertEquals("26.09.1918", result);
    }

    @Test
    public void test_1700() {
        int year = 1700;

        String result = DayOfProgrammer.dayOfProgrammer(year);

        Assert.assertEquals("12.09.1700", result);
    }

    @Test
    public void test_2700() {
        int year = 2700;

        String result = DayOfProgrammer.dayOfProgrammer(year);

        Assert.assertEquals("13.09.2700", result);
    }

}