import java.util.*;

public class F21 {
    public static void main(String[] args) {
        System.out.println(friday13(2023, 3));  // false
        System.out.println(friday13(2023, 1));  // true
        System.out.println(friday13(-2023, 1)); // false
    }

    public static boolean friday13(int year, int month) {
        if (year < 0) return false;
        Calendar calendar = new GregorianCalendar(year, month - 1, 13);
        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY;
    }
}
