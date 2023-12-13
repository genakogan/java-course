public class Cat extends Animal{
    public Cat() {
        // Call the superclass constructor with a specific sound
        super("Meow");
    }

    // Additional method specific to Cat
    public void purr() {
        System.out.println("Cat is purring.");
    }
}
