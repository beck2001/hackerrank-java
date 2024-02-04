import java.util.*;


public class EndOfFile {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int lines = 0;
        String str;
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            ++lines;
            System.out.printf("%d %s\n", lines, str);
        }
        scanner.close();
    }
}

