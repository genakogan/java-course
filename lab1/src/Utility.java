import java.util.Scanner;

public class Utility {


        public static void printFibonacci_v1(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter N: ");
            int N =scanner.nextInt();
            int a =1 , b =1;
            System.out.print(a + ", " + b);
            for(int i=3;i<=N;i++){
                int c = a+b;
                System.out.print( ", " + c);
                a=b;
                b=c;
            }
            System.out.println();
        }

    public void printFibonacci_v2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N: ");
        int N =scanner.nextInt();
        int a =1 , b =1;
        System.out.print(a + ", " + b);
        for(int i=3;i<=N;i++){
            int c = a+b;
            System.out.print( ", " + c);
            a=b;
            b=c;
        }
        System.out.println();
    }

    public void printPrimeNumbers(){
            for(int i=2; i<=200;i++){
                if(isPrime(i)){
                    System.out.println(i);
                }

            }
    }

    public boolean isPrime(int num){
            if(num<=1) return false;
            for(int i =2; i< Math.sqrt(num);i++){
                if(num%i==0){
                    return false;
                }
            }

            return true;
    }

    public void reverseAndPrintHexadecimal(){
            Scanner scanner= new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int number = scanner.nextInt();

            String reverseHed = new StringBuilder(Integer.toHexString(number).toUpperCase()).toString();

            if(Character.isAlphabetic(reverseHed.charAt(0))){
                reverseHed = "0" + reverseHed;
            }
            System.out.print("Reversed  Hexadecimal:"  + reverseHed);
            scanner.close();

    }

}
