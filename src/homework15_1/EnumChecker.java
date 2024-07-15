package homework15_1;

public class EnumChecker {
    public static void main(String[] args) {
        Advisor advisor = new DayAdvisorImpl();


        Day[] daysOfWeek = Day.values();


        for (Day day : daysOfWeek) {
            System.out.print(day + ": ");
            advisor.advise(day);
        }
    }
}