package co.jcuero.hackerrank;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivisionTest {

    @Test
    public void test_1() {
        List<Integer> integers = Arrays.asList(2, 2, 1, 3, 2);
        int d = 4;
        int m = 2;
        int result = SubarrayDivision.birthday(integers, d, m);

        Assert.assertEquals(2, result);
    }


    @Test
    public void test_2() {
        List<Integer> integers = Arrays.asList(1, 2, 1, 3, 2);
        int d = 3;
        int m = 2;
        int result = SubarrayDivision.birthday(integers, d, m);

        Assert.assertEquals(2, result);
    }


    @Test
    public void test_3() {
        List<Integer> integers = Arrays.asList(1, 1, 1, 1, 1, 1);
        int d = 3;
        int m = 2;
        int result = SubarrayDivision.birthday(integers, d, m);

        Assert.assertEquals(0, result);
    }

    @Test
    public void test_4() {
        List<Integer> integers = Arrays.asList(4);
        int d = 4;
        int m = 1;
        int result = SubarrayDivision.birthday(integers, d, m);

        Assert.assertEquals(1, result);
    }

    @Test
    public void test_5() {
        List<Integer> integers = Arrays.asList(4, 5, 4, 2, 4, 5, 2, 3, 2, 1, 1, 5, 4);
        int d = 15;
        int m = 4;
        int result = SubarrayDivision.birthday(integers, d, m);

        Assert.assertEquals(3, result);
    }

    @Test
    public void test_6() {
        List<Integer> integers = Arrays.asList(5, 1, 2, 4, 4, 2, 4, 2, 2, 5, 1, 4, 3, 1, 1, 1, 2, 1, 4, 1);
        int d = 18;
        int m = 6;
        int result = SubarrayDivision.birthday(integers, d, m);

        Assert.assertEquals(4, result);
    }
}
