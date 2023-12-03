
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        // Вызов конструктора суперкласса с использованием super
        super(name);
        this.breed = breed;
    }

    // Переопределение метода суперкласса
    @Override
    public void makeSound() {

        System.out.println("Dog barks");
    }

    public void printDetails() {
        super.makeSound();
        // Обращение к переменной класса суперкласса
        System.out.println("Name: " + super.getName()); // super используется для обращения к методу getName() суперкласса
        System.out.println("Breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Labrador");
        myDog.makeSound(); // Вызов метода из подкласса
        myDog.printDetails(); // Вызов метода из подкласса

        // Вызов метода суперкласса через объект подкласса
        myDog.super.makeSound(); // Это не сработает, так как super не может использоваться вне контекста подкласса
    }
}
