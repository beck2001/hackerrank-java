import java.util.*;


public class CalendarChallenge {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        Calendar cal = Calendar.getInstance();
        Date inputDate = new Date(year, month, day);
        cal.setTime(inputDate);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        
        switch(dayOfWeek) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> throw new IllegalStateException("Some shit happened");
        }

        scanner.close();
    }
}

