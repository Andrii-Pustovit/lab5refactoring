package task3;

public class Calculator {

    private Math math;

    public Calculator() {
        this.math = new Math();
    }

    public double add(double a, double b) {
        return math.addExact(a, b);
    }
}

