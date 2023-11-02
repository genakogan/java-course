import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numerator = 10;
        int denominator = 0;

        try {
            int result = numerator / denominator; // Potential division by zero
            System.out.println("Result: " + result); // This line won't be reached
        } catch (ArithmeticException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

        System.out.println("Program continues running.");
    }

}