import java.util.*;


public class StringConvertion {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        try {
            int n = scanner.nextInt();
            scanner.close();
            String s = String.valueOf(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception ex) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

