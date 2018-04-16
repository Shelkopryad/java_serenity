package core;

public class Calc {

    public int sum(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return Integer.MAX_VALUE;
        }
    }

    public int square(int a) {
        return a * a;
    }

}
