import java.util.Scanner;

public class Examples {

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
   }
}
