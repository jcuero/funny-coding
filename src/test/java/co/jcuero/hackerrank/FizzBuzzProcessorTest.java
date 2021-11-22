package co.jcuero.hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzProcessorTest {

    @Test
    public void FizzBuzzNormalNumbers() {

        Assert.assertEquals("1", FizzBuzzProcessor.convert(1));
        Assert.assertEquals("2", FizzBuzzProcessor.convert(2));
    }

    @Test
    public void FizzBuzzThreeNumbers() {

        Assert.assertEquals("Fizz", FizzBuzzProcessor.convert(3));
    }

    @Test
    public void FizzBuzzFiveNumbers() {

        Assert.assertEquals("Buzz", FizzBuzzProcessor.convert(5));
    }

    @Test
    public void FizzBuzzThreeAndFiveNumbers() {

        Assert.assertEquals("Buzz", FizzBuzzProcessor.convert(5));
    }

}