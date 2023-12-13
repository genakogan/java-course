import java.util.Scanner;
public class Main {
    public static void main(String[] args) {



            // Create instances of subclasses
            Dog myDog = new Dog();
            Cat myCat = new Cat();

            // Call methods from the superclass and subclasses
            myDog.makeSound(); // Output: Animal makes a sound: Woof
            myDog.wagTail();   // Output: Dog is wagging its tail.
            myCat.makeSound(); // Output: Animal makes a sound: Meow
            myCat.purr();      // Output: Cat is purring.


    }
}