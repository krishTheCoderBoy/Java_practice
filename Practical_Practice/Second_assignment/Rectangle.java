package Practical_Practice.Second_assignment;

    import java.util.Scanner;

    public class Rectangle {

        private float length;
        private float breadth;

        public void inputData() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter length of the Rectangle: ");
            length = scanner.nextFloat();
            System.out.println("Enter breadth of the Rectangle: ");
            breadth = scanner.nextFloat();
            scanner.close();
        }

        public float calculateArea() {
            return length * breadth;
        }

        public float calculatePerimeter() {
            return 2 * (length + breadth);
        }

        public void outputData() {
            System.out.println("Area of the Rectangle: " + calculateArea());
            System.out.println("Perimeter of the Rectangle: " + calculatePerimeter());
        }

        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle();
            rectangle.inputData();
            rectangle.outputData();
        }
    }

