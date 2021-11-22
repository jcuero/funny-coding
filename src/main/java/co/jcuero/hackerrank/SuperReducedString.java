package co.jcuero.hackerrank;

/**
 * @author <a href="https://github.com/jcuero">Jose Fary Hurtado Cuero</a>
 * @since 08 nov. 2020
 */
public class SuperReducedString {

    private SuperReducedString() {
    }

    public static String superReducedString(String s) {
        String emptyString = "";
        int i = 1;
        char lastChart;
        char currentChart;

        while (s.length() > 0 && i < s.length()) {
            lastChart = s.charAt(i - 1);
            currentChart = s.charAt(i);

            if (lastChart == currentChart) {
                s = s.replaceFirst(emptyString + lastChart + currentChart, emptyString);
                i = 0;
            }

            i++;
        }

        if (s.isEmpty()) {
            return "Empty String";
        }

        return s;
    }
}
