package co.jcuero.hackerrank;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


/**
 * @author <a href="https://github.com/jcuero">Jose Fary Hurtado Cuero</a>
 * @since 26 nov. 2021
 */
public class MigratoryBirdsTest {

    @Test
    public void test_1() {
        List<Integer> integers = Arrays.asList(1, 1, 2, 2, 3);

        int result = MigratoryBirds.migratoryBirds(integers);

        Assert.assertEquals(1, result);
    }

    @Test
    public void test_2() {
        List<Integer> integers = Arrays.asList(1, 4, 4, 4, 5, 3);
        int result = MigratoryBirds.migratoryBirds(integers);

        Assert.assertEquals(4, result);
    }

    @Test
    public void test_3() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
        int result = MigratoryBirds.migratoryBirds(integers);

        Assert.assertEquals(3, result);
    }
}