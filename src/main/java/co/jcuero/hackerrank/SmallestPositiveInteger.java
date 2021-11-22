package co.jcuero.hackerrank;

import java.util.Arrays;

/**
 * @author <a href="https://github.com/jcuero">Jose Fary Hurtado Cuero</a>
 * @since 08 nov. 2020
 */
public class SmallestPositiveInteger {

    private SmallestPositiveInteger() {
    }

    public static int solution(int[] A) {
        // cero representa un comodín que usaremos para tener un punto de partida
        // neutro con el cual realizar comparaciones
        A = Arrays.copyOf(A, A.length + 1);
        A[A.length - 1] = 0;

        Arrays.sort(A);

        boolean allAreNegatives = A[A.length - 1] <= 0;
        boolean allAreGreaterThanOne = A[0] > 1;
        if (allAreNegatives || allAreGreaterThanOne) {
            return 1;
        }

        for (int i = 0; i < A.length - 1; i++) {
            int current = A[i];
            int next = A[i + 1];

            int distance = next - current;
            int possible = current + 1;

            if (distance > 1 && possible > 0) {
                return possible;
            }
        }

        return A[A.length - 1] + 1;
    }
}
