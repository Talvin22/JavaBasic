package homework15_1;

class DayAdvisorImpl implements Advisor {
    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Stay focused and keep up the good work! Plan your tasks, take breaks, and stay organized.");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
                System.out.println("Visit an ice-cream store today");
                break;
            case SUNDAY:
                System.out.println("Visit a nature park today");
                break;
        }
    }
}


