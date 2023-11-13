import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Examples {
    // ===================================================================
   public static void ifElseExanple(){
       int number = 3;

       // Check if the number is greater than 5
       if (number > 5) {
           System.out.println("The number is greater than 5.");
       } else {
           System.out.println("The number is not greater than 5.");
       }

       // Check if the number is even or odd
       if (number % 2 == 0) {
           System.out.println("The number is even.");
       } else {
           System.out.println("The number is odd.");
       }

       // Check if the number is positive, negative, or zero
       if (number > 0) {
           System.out.println("The number is positive.");
       } else if (number < 0) {
           System.out.println("The number is negative.");
       } else {
           System.out.println("The number is zero.");
       }

       // short if-else statement
       // result = (condition) ? valueIfTrue : valueIfFalse;
       int x = 10;
       int y = 20;

       int max = (x > y) ? x : y;
       System.out.println("The Max result: "+ max);

       if (x > 0 && y > 0) {
           System.out.println("Both x and y are positive.");
       } else if (x > 0 || y > 0) {
           System.out.println("At least one of x or y is positive.");
       } else {
           System.out.println("Both x and y are non-positive.");
       }
   }
   // ===================================================================
   public static void switchCaseExample (){
       int dayOfWeek = 3;

       switch (dayOfWeek) {
           case 1:
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;
           default:
               System.out.println("Invalid day of the week");
       }
   }

    public static void tryCatchExample(){
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
    // ===================================================================

    public static void forLoopExample(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }
    }

    // ===================================================================
    public static void whileLoopExample(){
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }
    }
    // ===================================================================
    public static void doWhileLoopExample (){

        int x = 5;
        do {
            System.out.println("x = " + x);
            x--;
        } while (x > 0);
    }

    // ===================================================================
    public static void mapExample  (){
// Create a HashMap to store key-value pairs
        Map<String, Integer> studentGrades = new HashMap<>();

        // Add key-value pairs to the map
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 92);
        studentGrades.put("David", 78);
        studentGrades.put("Eve", 88);

        // Access values by key
        int aliceGrade = studentGrades.get("Alice");
        int bobGrade = studentGrades.get("Bob");

        // Check if a key exists in the map
        boolean hasKey = studentGrades.containsKey("Charlie");

        // Remove a key-value pair
        studentGrades.remove("David");

        // Iterate over the keys and values
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            int grade = entry.getValue();
            System.out.println(studentName + "'s grade: " + grade);
        }
    }

    public static void solutionTask9  (){
        // Create a Scanner object for input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Get a five-digit number from the user
        System.out.print("Enter a five-digit number: ");
        int inputNumber = scanner.nextInt();

        // Check that the number is indeed a five-digit number
        if (inputNumber >= 10000 && inputNumber <= 99999) {
            // Extract individual digits
            int fifthDigit = inputNumber % 10;
            int fourthDigit = (inputNumber / 10) % 10;
            int thirdDigit = (inputNumber / 100) % 10;
            int secondDigit = (inputNumber / 1000) % 10;
            int firstDigit = (inputNumber / 10000) % 10;

            // Form a new number with swapped first and last digits
            int newNumber = fifthDigit * 10000 + fourthDigit * 1000 + thirdDigit * 100 + secondDigit * 10 + firstDigit;

            // Print the result
            System.out.println("New number with swapped first and last digits: " + newNumber);
        } else {
            System.out.println("Enter error.");
        }

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
