import java.util.*;


public class InitializerBlock {
    
    static int B, H;
    static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        flag = B > 0 && H > 0;
        scanner.close();
    }

    public static void main(String[] args) {
        if (flag) {
            System.out.println(B * H);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
