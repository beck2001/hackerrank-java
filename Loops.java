import java.util.*;


public class Loops {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.close();
        
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }
}
