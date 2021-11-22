package co.jcuero.hackerrank;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author <a href="https://github.com/jcuero">Jose Fary Hurtado Cuero</a>
 * @since 08 nov. 2020
 */
public class CatAndMouseTest {


    @Test
    public void testCatBShouldGetThereFirst() {
        int x = 2;
        int y = 5;
        int z = 4;
        String result = CatAndMouse.catAndMouse(x, y, z);

        Assert.assertEquals("Cat B", result);
    }

    @Test
    public void testCatBShouldGetThereFirst2() {
        int x = 1;
        int y = 2;
        int z = 3;
        String result = CatAndMouse.catAndMouse(x, y, z);

        Assert.assertEquals("Cat B", result);
    }

    @Test
    public void testCatAShouldGetThereFirst() {
        int x = 0;
        int y = 150;
        int z = 50;
        String result = CatAndMouse.catAndMouse(x, y, z);

        Assert.assertEquals("Cat A", result);
    }

    @Test
    public void testMouseEscapes() {
        int x = 1;
        int y = 3;
        int z = 2;
        String result = CatAndMouse.catAndMouse(x, y, z);

        Assert.assertEquals("Mouse C", result);
    }
}