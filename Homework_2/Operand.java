package Homework_2;

public class Operand implements Operator{
    protected double a;

    public Operand(String input) {
        try {
            this.a = Double.parseDouble(input);
        } catch (Exception e) {
            System.err.println("Can`t parse line, set to 0.");
            this.a = 0;
        }
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
