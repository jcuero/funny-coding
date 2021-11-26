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
        int response = 0;

        if (s.isEmpty()) {
            return response;
        }

        for (int i = 0; i < s.size(); i++) {
            int toIndex = i + m;

            if (toIndex > s.size()) {
                return response;
            }

            response += s.subList(i, toIndex).stream().mapToInt(Integer::intValue).sum() == d ? 1 : 0;
        }

        return response;
    }
}
