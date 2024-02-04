import java.util.*;


public class Datatypes {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int n = scanner.nextInt();
        while (n-- > 0) {
            try {
                long number = scanner.nextLong();
                System.out.println(number + " can be fitted in:");
                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception ex) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}

