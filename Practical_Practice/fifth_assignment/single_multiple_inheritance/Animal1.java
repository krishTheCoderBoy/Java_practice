package Practical_Practice.fifth_assignment.single_multiple_inheritance;

//Parent class
class Animal {
    void sound() {
        System.out.println("The animal makes a sound");
    }
}

//Child class
class Dog extends Animal {
    void sound() {
        System.out.println("The dog barks");
    }
}

public class Animal1{
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.sound(); //output: The animal makes a sound
        dog.sound(); //output: The dog barks
    }
}
