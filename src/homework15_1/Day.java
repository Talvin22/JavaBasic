package homework15_1;

public enum Day implements Advisor{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY{
        @Override
        public void advise(Day day){
            System.out.println("Happy Friday!");
        }
    },

    SATURDAY{
        @Override
        public void advise(Day day) {
            System.out.println("Visit an ice-cream store today");
        }
    },
    SUNDAY{
        @Override
        public void advise(Day day) {
            System.out.println("Visit a nature park today");
        }
    };

    @Override
    public void advise(Day day) {
        System.out.println("A coup of tea makes you more happier with work");
    }
}
