import java.util.Scanner;
import java.util.regex.*;


public class PatternSyntaxChecker {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = Integer.parseInt(scanner.nextLine());
        while (testCases > 0) {
            String pattern = scanner.nextLine();
            --testCases;
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException ex) {
                System.out.println("Invalid");
            }
        }
        scanner.close();
    }
}

