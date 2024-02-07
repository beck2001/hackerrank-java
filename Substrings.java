import java.util.*;


public class Substrings {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.close();

        System.out.println(str.substring(start, end));
    }
}

