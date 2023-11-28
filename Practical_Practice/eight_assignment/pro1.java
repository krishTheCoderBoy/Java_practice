package Practical_Practice.eight_assignment;

public class pro1 {

        public static void main(String[] args) {
            MyClass obj = new MyClass();

            obj.publicMethod();
            obj.defaultMethod();
            obj.protectedMethod();
            obj.privateMethod();
        }
    }

    class MyClass {
        public void publicMethod() {
            System.out.println("Public method in MyClass.");
        }

        void defaultMethod() {
            System.out.println("Default method in MyClass.");
        }

        protected void protectedMethod() {
            System.out.println("Protected method in MyClass.");
        }

        void privateMethod() {
            System.out.println("Private method in MyClass.");
        }
    }

