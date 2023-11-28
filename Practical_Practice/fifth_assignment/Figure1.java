package Practical_Practice.fifth_assignment;

//Parent abstract class
abstract class Figure {
    abstract double getArea();
}

//Child class 1
class Rectangle extends Figure {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }
}

//Child class 2
class Triangle extends Figure {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double getArea() {
        return 0.5 * base * height;
    }
}

public class Figure1{
    public static void main(String[] args) {
        Figure figure1 = new Rectangle(5, 10);
        Figure figure2 = new Triangle(5, 10);

        System.out.println("Area of Figure 1: " + figure1.getArea());
        System.out.println("Area of Figure 2: " + figure2.getArea());
    }
}