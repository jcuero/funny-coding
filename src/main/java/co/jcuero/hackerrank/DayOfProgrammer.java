package co.jcuero.hackerrank;

/**
 * @author <a href="https://github.com/jcuero">Jose Fary Hurtado Cuero</a>
 * @since 08 nov. 2020
 */
public class DayOfProgrammer {

    private DayOfProgrammer() {
    }

    private static boolean isDivisible(int year, int n) {
        return year % n == 0;
    }

    private static boolean isLeapYearInJuliaCalendar(int year) {
        return isDivisible(year, 4);
    }

    private static boolean isLeapYearInGregorianCalendar(int year) {
        return isDivisible(year, 400) || (isDivisible(year, 4) && !isDivisible(year, 100));
    }

    private static int getDaysInFebruary(int year, boolean isLeapYear) {
        int daysInFebruary = isLeapYear ? 29 : 28;

        if (year == 1918) {
            daysInFebruary = daysInFebruary - 13;
        }

        return daysInFebruary;
    }

    public static String dayOfProgrammer(int year) {
        boolean isJulia = year >= 1700 && year <= 1917;
        boolean isGregorian = year >= 1918 && year <= 2700;
        int daysInFebruary;

        if (isJulia) {
            daysInFebruary = getDaysInFebruary(year, isLeapYearInJuliaCalendar(year));
        } else if (isGregorian) {
            daysInFebruary = getDaysInFebruary(year, isLeapYearInGregorianCalendar(year));
        } else {
            return null;
        }

        int days = 31 + daysInFebruary + 31 + 30 + 31 + 30 + 31 + 31;
        return (256 - days) + ".09." + year;
    }
}
