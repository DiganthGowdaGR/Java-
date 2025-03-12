import java.time.LocalDate;
import java.time.DayOfWeek;

class dayFinder {
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString(); // Returns day in uppercase (e.g., "WEDNESDAY")
    }
}
