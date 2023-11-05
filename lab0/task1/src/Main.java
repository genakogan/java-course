import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values from the user
        System.out.print("Enter an integer (int): ");
        int intValue = scanner.nextInt();

        System.out.print("Enter a floating-point number (float): ");
        float floatValue = scanner.nextFloat();

        System.out.print("Enter a double-precision floating-point number (double): ");
        double doubleValue = scanner.nextDouble();

        System.out.print("Enter a character (char): ");
        char charValue = scanner.next().charAt(0); // Read the first character of the input string

        System.out.print("Enter a long integer (long): ");
        long longValue = scanner.nextLong();

        // Output variables in reverse order
        System.out.println("Reverse order:");
        System.out.println("long: " + longValue);
        System.out.println("char: " + charValue);
        System.out.println("double: " + doubleValue);
        System.out.println("float: " + floatValue);
        System.out.println("int: " + intValue);

        scanner.close();
    }
}