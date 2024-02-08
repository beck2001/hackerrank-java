import java.util.*;


public class PalindromeCheck {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String inputString = scanner.next();
        scanner.close();

        if (isPalindrome(inputString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; ++i) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

