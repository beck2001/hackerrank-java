import java.util.*;


public class Anagrams {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams": "Not Anagrams");
    }

    private static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] charactersOfA = a.toLowerCase().toCharArray();
        char[] charactersOfB = b.toLowerCase().toCharArray();

        int[] frequencyOfA = new int[26];
        int[] frequencyOfB = new int[26];
    
        for (int i = 0; i < a.length(); ++i) {
            frequencyOfA[charactersOfA[i] - 'a']++;
            frequencyOfB[charactersOfB[i] - 'a']++;
        }

        for (int i = 0; i < 26; ++i) {
            if (frequencyOfA[i] != frequencyOfB[i]) {
                return false;
            }
        }
        return true;
    }
}


