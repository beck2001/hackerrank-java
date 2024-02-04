import java.util.*;


public class InputTwo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String str = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


