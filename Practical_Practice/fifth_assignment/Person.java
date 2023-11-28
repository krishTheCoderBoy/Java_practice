package Practical_Practice.fifth_assignment;

public class Person {
    private static int nextId = 1;
    private int id;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        person1.printInfo();
        person2.printInfo();

        System.out.println("Next ID to be assigned: " + Person.getNextId());
    }
}
