package Practical_Practice.fifth_assignment.single_multiple_inheritance;

//Grandparent class
class Vehicle1 {
    void run() {
        System.out.println("Vehicle is running");
    }
}

//Parent class
class Car extends Vehicle1 {
    void run() {
        System.out.println("Car is running smoothly");
    }
}

//Child class
class Toyota extends Car {
    void run() {
        System.out.println("Toyota is running powerfully");
    }
}

public class  Vehicle2 {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        toyota.run(); //output: Toyota is running powerfully
    }
}