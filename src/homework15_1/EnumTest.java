package homework15_1;

public class EnumTest {

    private static void switchAdvise(Day day) {
        switch (day) {
            case MONDAY -> day.advise(Day.MONDAY);
            case TUESDAY -> day.advise(Day.TUESDAY);
            case WEDNESDAY -> day.advise(Day.WEDNESDAY);
            case THURSDAY -> day.advise(Day.THURSDAY);
            case FRIDAY -> day.advise(Day.FRIDAY);
            case SATURDAY -> day.advise(Day.SATURDAY);
            case SUNDAY -> day.advise(Day.SUNDAY);
        }
    }

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            switchAdvise(day);
        }
    }
}
