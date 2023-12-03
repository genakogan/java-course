import java.util.Scanner;
public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // if - else example
//        Examples.ifElseExanple();
//
//        // switch - case Example
//        Examples.switchCaseExample();
//
//        // try - catch example
//        Examples.tryCatchExample();
//
//        // for loop example
//        Examples.forLoopExample();
//
//        // while loop example
//        Examples.whileLoopExample();
//
//        //  do - while loop example
//        Examples.doWhileLoopExample();
//
//        // map example
//        Examples.mapExample();
//
//        // solution task 9
//        Examples.solutionTask9();
//
//        scanner.close();
//    }

    private int value;

    // Дефолтный конструктор
    public Main() {
        this.value = 9;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Main example = new Main();
        System.out.println("Value: " + example.getValue());
    }

}