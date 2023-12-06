import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Person example1 = new Person("fdffsdf",25);
        Person example2 = new Person(new Person("asdasd",example1.getAge()));
        System.out.println("Value: " + example2.getAge());
    }

}