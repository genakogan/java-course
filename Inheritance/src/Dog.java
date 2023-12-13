public class Dog extends Animal{
    public Dog() {
        // Call the superclass constructor with a specific sound
        super("Woof");
    }

    // Additional method specific to Dog
    public void wagTail() {
        System.out.println("Dog is wagging its tail.");
    }

}
