public class Animal {
    private String sound;

    public Animal(String sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound: " + sound);
    }
}
