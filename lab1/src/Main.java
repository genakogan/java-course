// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static double doAdd(double num1, double num2){
        return num1 + num2;
    }
    public static double doSub(double num1, double num2){
        return num1 - num2;
    }
    public static double doMul(double num1, double num2){
        return num1 * num2;
    }
    public static double doDiv(double num1, double num2){
        return num1 / num2;
    }
    public static double doPower(double num1, double num2){
        return Math.pow(num1, num2);
    }
    public static void op2Nums(int num1, int num2){
        System.out.println("Сумма = " + (num1 + num2));
        System.out.println("Произведение = " + (num1 * num2));
        System.out.println("Разница = " + Math.abs(num1 - num2));
    }
    public static int sumDigits(int num){
        int firstNum = num / 100;
        int secondNum = num / 10 % 10;
        int thirdNum = num % 10;
        return firstNum + secondNum + thirdNum;
    }
    public static int max3Int(int num1, int num2, int num3){
        return Math.max(Math.max(num1, num2), num3);
    }
    public static int do9Complement(int num){
        int firstNum = 9 - num / 1000;
        int secondNum = 9 - num / 100 % 10;
        int thirdNum = 9 - num /10 % 10;
        int fourthNum = 9 - num % 10;
        return firstNum * 1000 + secondNum * 100 + thirdNum * 10 + fourthNum;
    }
    public static boolean sumEven(int num){
        int firstNum = num / 100;
        int secondNum = num / 10 % 10;
        int thirdNum = num % 10;
        return (firstNum % 2 == 0 && secondNum % 2 == 0 && thirdNum % 2 == 0);
    }
    public static int arrangedDigits(int num){
        int firstNum = 9 - num / 1000;
        int secondNum = 9 - num / 100 % 10;
        int thirdNum = 9 - num /10 % 10;
        int fourthNum = 9 - num % 10;
        if (firstNum > secondNum && secondNum > thirdNum && thirdNum > fourthNum){
            return 1;
        }
        else if (firstNum < secondNum && secondNum < thirdNum && thirdNum < fourthNum){
            return 2;
        }
        else{
            return 3;
        }
    }
    public static int getFactor(int num){
        if (num > 95){
            return 100 - num;
        }
        else if (num > 85){
            return 4;
        }
        else if (num > 55){
            return 6;
        }
        else{
            return 0;
        }
    }
    public static void number1(){
        double a = 2;
        double b = 3;
        double c = 4;
        System.out.println("а) " + doAdd(doPower(doAdd(a,doDiv(doSub(b, 2), doAdd(c, 5))), 5), doDiv(18, a)));
        System.out.println("б) " + doPower(doSub(doDiv(1,a), doDiv(a,doDiv(doMul(2,b), doSub(c,5)))), doDiv(1,2)));
        a = 3.5;
        b = 2.5;
        c = -17;
        System.out.println("а) " + doAdd(doPower(doAdd(a,doDiv(doSub(b, 2), doAdd(c, 5))), 5), doDiv(18, a)));
        System.out.println("б) " + doPower(doSub(doDiv(1,a), doDiv(a,doDiv(doMul(2,b), doSub(c,5)))), doDiv(1,2)));
    }
    public static void number2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое целое целое число");
        int num1 = in.nextInt();
        System.out.println("Введите второе целое число");
        int num2 = in.nextInt();
        op2Nums(num1, num2);
    }
    public static void number3(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите трёхзначное число");
        int num1 = in.nextInt();
        System.out.println("Введите трёхзначное число");
        int num2 = in.nextInt();
        int result = sumDigits(num1) > sumDigits(num2) ? num1 : num2;
        System.out.println("Сумма цифр больше у числа " + result);
    }
    public static void number4(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int num1 = in.nextInt();
        System.out.println("Введите целое число");
        int num2 = in.nextInt();
        System.out.println("Введите целое число");
        int num3 = in.nextInt();
        System.out.println("Наибольшее число из трёх равняется " + max3Int(num1, num2, num3));
    }
    public static void number5(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите четырёхзначное число");
        int num = in.nextInt();
        System.out.println("Полученное число = " + do9Complement(num));
    }
    public static void number6(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        if (num > 99 && num < 1000){
            System.out.println("Результат функции = " + sumEven(num));
        }
        else{
            System.out.println("Число не является трёхзначным!");
        }
    }
    public static void number7(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите четырёхзначное число");
        int num = in.nextInt();
        int result = arrangedDigits(num);
        if (result == 1){
            System.out.println("Цифры расположены в порядке возрастания");
        }
        else if (result == 2){
            System.out.println("Цифры расположены в порядке убывания");
        }
        else{
            System.out.println("У цифр беспорядок");
        }
    }
    public static void number8(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество баллов студента");
        int score = in.nextInt();
        System.out.println("Количество баллов в итоге = " + (score + getFactor(score)));
    }
    public static void main(String[] args) {
        number1();
        number2();
        number3();
        number4();
        number5();
        number6();
        number7();
        number8();
    }
}