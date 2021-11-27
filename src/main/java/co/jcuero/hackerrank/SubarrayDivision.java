package co.jcuero.hackerrank;

import java.util.List;

/**
 * @author <a href="https://github.com/jcuero">Jose Fary Hurtado Cuero</a>
 * @since 23 nov. 2021
 */
public class SubarrayDivision {

    private SubarrayDivision() {
    }

    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;

        if (s.isEmpty()) {
            return result;
        }

        for (int i = 0; i < s.size(); i++) {
            int toIndex = i + m;

            if (toIndex > s.size()) {
                return result;
            }

            result += s.subList(i, toIndex).stream().mapToInt(Integer::intValue).sum() == d ? 1 : 0;
        }

        return result;
    }
}
