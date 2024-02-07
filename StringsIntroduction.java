import java.util.*;


public class StringsIntroduction {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();

        int length = a.length() + b.length();
        String aIsLargerThanB = a.compareTo(b) > 0 ? "Yes": "No";

        System.out.println(length);
        System.out.println(aIsLargerThanB);
        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase() + b.substring(1));
    }
}

