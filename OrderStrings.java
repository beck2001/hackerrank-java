import java.util.*;


public class OrderStrings {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String inputString = scanner.next();
        int k = scanner.nextInt();
        scanner.close();

        String maxString = inputString.substring(0, k);
        String minString = inputString.substring(0, k);

        for (int i = 0; i + k <= inputString.length(); ++i) {
            String tmpString = inputString.substring(i, i + k);
            if (tmpString.compareTo(maxString) > 0) {
                maxString = tmpString;
            }
            if (tmpString.compareTo(minString) < 0) {
                minString = tmpString;
            }
        }
        System.out.println(minString);
        System.out.println(maxString);
    }
}

