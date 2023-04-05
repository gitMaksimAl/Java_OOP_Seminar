package Homework_2;

public class Operand implements Operator{
    private double a;

    public Operand(double d) {
        this.a = d;
    }

    @Override
    public double add(double b) {
        return a + b;
    }

    @Override
    public double sub(double b) {
        return a - b;
    }

    @Override
    public double mult(double b) {
        return a * b;
    }

    @Override
    public double div(double b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
            return 0;
        }
    }
}
