import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int thirdNumber = scanner.nextInt();

        double average = Test.calculateAverage(firstNumber, secondNumber, thirdNumber);

        System.out.println("The average is: " + average);

        scanner.close();
    }

}