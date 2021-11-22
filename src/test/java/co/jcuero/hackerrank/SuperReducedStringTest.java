package co.jcuero.hackerrank;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author <a href="https://github.com/jcuero">Jose Fary Hurtado Cuero</a>
 * @since 08 nov. 2020
 */
public class SuperReducedStringTest {


    @Test
    public void test1() {
        String value = "aaabccddd";
        String result = SuperReducedString.superReducedString(value);

        Assert.assertEquals("abd", result);
    }

    @Test
    public void testEmptyResult() {
        String value = "baab";
        String result = SuperReducedString.superReducedString(value);

        Assert.assertEquals("Empty String", result);
    }

    @Test
    public void testEmptyResult2() {
        String value = "aa";
        String result = SuperReducedString.superReducedString(value);

        Assert.assertEquals("Empty String", result);
    }


}