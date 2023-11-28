package Practical_Practice.fourth_assignment;

public class Population {
    private float p;
    private float r;

    Population(float a, float b) {
        p = a;
        r = b;
    }

    void print() {
        float result = p;
        for (int i = 2001; i <= 2007; i++) {
            result = result * (1 + r / 100);
            System.out.println("Population in the year " + i + " is " + result);
        }
    }

    public static void main(String[] args) {
        Population population = new Population(1000000, 5);
        population.print();
    }
}
