package co.jcuero.hackerrank;

/**
 * @author <a href="https://github.com/jcuero">Jose Fary Hurtado Cuero</a>
 * @since 08 nov. 2020
 */
public class CatAndMouse {

    private CatAndMouse() {
    }

    public static String catAndMouse(int x, int y, int z) {
        int distanceCatA = Math.abs(x - z);
        int distanceCatB = Math.abs(y - z);

        if (distanceCatA < distanceCatB) {
            return "Cat A";
        } else if (distanceCatB < distanceCatA) {
            return "Cat B";
        }

        return "Mouse C";
    }
}
