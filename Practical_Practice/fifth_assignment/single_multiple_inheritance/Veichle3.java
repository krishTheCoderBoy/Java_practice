package Practical_Practice.fifth_assignment.single_multiple_inheritance;

//Parent class
class Vehicle4 {
    void run() {
        System.out.println("Vehicle is running");
    }
}

//Child class
class Bike1 extends Vehicle4 {
    void run() {
        System.out.println("Bike is running safely");
        super.run(); //output: Vehicle is running
    }
}

public class Veichle3  {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run(); //output: Bike is running safely followed by Vehicle is running
    }
}