package co.jcuero.hackerrank;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author <a href="https://github.com/jcuero">Jose Fary Hurtado Cuero</a>
 * @since 26 nov. 2021
 */
public class DivisibleSumPairs {

    private DivisibleSumPairs() {
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        List<Integer> values = ar.stream().sorted().collect(Collectors.toList());
        int result = 0;

        for (int i = 0; i < values.size(); i++) {
            int iValue = values.get(i);

            for (int j = i + 1; j < values.size(); j++) {
                int jValue = values.get(j);

                if ((iValue + jValue) % k == 0) {
                    result += 1;
                }
            }
        }

        return result;
    }

}
