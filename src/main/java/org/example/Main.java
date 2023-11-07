package org.example;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override // Аннотация == переопределение метода
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal catAsAnimal = new Cat();
        Cat cat = new Cat();

        animal.makeSound();       // Output: Animal makes a sound
        catAsAnimal.makeSound();  // Output: Cat meows
        cat.makeSound();          // Output: Cat meows
    }
}
