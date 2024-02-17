import java.util.*;


public class StringTokens {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scanner.nextLine();
        scanner.close();

        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            s = s.trim();
            String[] result = s.split("[ !,?._'@]+");
            System.out.println(result.length);
            for (String str : result) {
                System.out.println(str);
            }
        }
    }
}

