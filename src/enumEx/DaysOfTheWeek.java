package enumEx;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        EnumWeek.DaysOfTheWeek day;
        day=EnumWeek.DaysOfTheWeek.THURSDAY;
        switch(day){
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
               break;
            case FRIDAY:
                System.out.println("Fridays are great");
               break;
            case SATURDAY:
                case SUNDAY:
                System.out.println("Weekends are great");
                    break;
            default:
                System.out.println("Regular days are ok");



        }
    }
}
