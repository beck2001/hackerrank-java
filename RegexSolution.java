import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class RegexSolution {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (scanner.hasNext()) {
            String ip = scanner.next();
            System.out.println(ip.matches(new MyRegex().pattern));
        }
        scanner.close();
    }
}

class MyRegex {
    String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}


    
