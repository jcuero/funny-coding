package co.jcuero.hackerrank;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author <a href="https://github.com/jcuero">Jose Fary Hurtado Cuero</a>
 * @since 26 nov. 2021
 */
public class DivisibleSumPairsTest {

    @Test
    public void test_1() {
        List<Integer> integers = Arrays.asList(1, 3, 2, 6, 1, 2);
        int n = 6;
        int k = 3;
        int result = DivisibleSumPairs.divisibleSumPairs(n, k, integers);

        Assert.assertEquals(5, result);
    }
}