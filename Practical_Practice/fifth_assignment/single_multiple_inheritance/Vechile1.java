package Practical_Practice.fifth_assignment.single_multiple_inheritance;

//Parent class
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

//Child class
class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running safely");
    }
}

public class Vechile1{
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run(); //output: Bike is running safely
    }
}
