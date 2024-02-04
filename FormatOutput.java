import java.util.*;


public class FormatOutput {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("================================");
        for (int i = 0; i < 3; ++i) {
            String str = scanner.next();
            int x = scanner.nextInt();
            System.out.printf("%-15s%03d\n", str, x);
        }
        System.out.println("================================");
        scanner.close();
    }
}
        
