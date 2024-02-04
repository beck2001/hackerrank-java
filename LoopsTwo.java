import java.util.*;
import java.lang.Math;


public class LoopsTwo {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, n, res;
        int q = scanner.nextInt();
        while (q-- > 0) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();
            for (int i = 0; i < n; ++i) {
                a += Math.pow(2, i) * b;
                System.out.print(a + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

