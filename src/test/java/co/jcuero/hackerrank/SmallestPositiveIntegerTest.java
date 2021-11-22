package co.jcuero.hackerrank;


import org.junit.Assert;
import org.junit.Test;

/**
 * @author <a href="https://github.com/jcuero">Jose Fary Hurtado Cuero</a>
 * @since 08 nov. 2020
 */
public class SmallestPositiveIntegerTest {

    @Test
    public void shouldReturnOneWhenInputValuesOnlyContainZero() {
        int[] input = {0};
        int result = SmallestPositiveInteger.solution(input);

        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldReturnTwoWhenInputValuesOnlyContainOne() {
        int[] input = {1};
        int result = SmallestPositiveInteger.solution(input);

        Assert.assertEquals(2, result);
    }

    @Test
    public void shouldReturnTwoWhenInputValuesOnlyContainNumber3() {
        int[] input = {3};
        int result = SmallestPositiveInteger.solution(input);

        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldReturnOneWhenInputValuesOnlyContainMinusOne() {
        int[] input = {-1};
        int result = SmallestPositiveInteger.solution(input);

        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldReturnOneWhenInputValuesAreOnlyNegativeNumbers() {
        int[] input = {-120, -20, -50};
        int result = SmallestPositiveInteger.solution(input);

        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldReturnLastPlusOneWhenInputValuesAreConsecutive() {
        int[] input = {3, 1, 2, 4, 5, 6};
        int result = SmallestPositiveInteger.solution(input);

        Assert.assertEquals(7, result);
    }

    @Test
    public void shouldReturnFiveWhenThereIsOnlyOneLeftToBeConsecutive() {
        int[] input = {1, 2, 3, 4, 6};
        int result = SmallestPositiveInteger.solution(input);

        Assert.assertEquals(5, result);
    }

    @Test
    public void shouldReturnFiveWhenThereIsTwoLeftToBeConsecutive() {
        int[] input = {1, 2, 3, 4, 7};
        int result = SmallestPositiveInteger.solution(input);

        Assert.assertEquals(5, result);
    }

    @Test
    public void shouldReturnOneWhenThereIsOnlyOnePositive() {
        int[] input = {-20, -120, -58, 57};
        int result = SmallestPositiveInteger.solution(input);

        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldReturnOneWhenThereIsOnlyOnePositiveTwice() {
        int[] input = {-20, -120, -58, 57, 57};
        int result = SmallestPositiveInteger.solution(input);

        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldReturnOneWhenMinIsTwo() {
        int[] input = {4, 5, 6, 2};
        int result = SmallestPositiveInteger.solution(input);

        Assert.assertEquals(1, result);
    }


    @Test
    public void shouldReturnSevenWhenThereIsOnlyOneNegativeAndSequences() {
        int[] input = {3, 4, 5, 2, -20, 1, 6};
        int result = SmallestPositiveInteger.solution(input);

        Assert.assertEquals(7, result);
    }

    @Test
    public void shouldReturnSevenWhenThereIsOnlyOneNegativeAndSequences2() {
        int[] input = {3, 4, 5, 2, -20, 1, 6, 6};
        int result = SmallestPositiveInteger.solution(input);

        Assert.assertEquals(7, result);
    }


}