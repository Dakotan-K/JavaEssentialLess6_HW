package addTask;

public class Calculator {

    public int sum (int a, int b) {
        return a + b;
    }

    public int sub (int a, int b) {
        return a - b;
    }

    public double div (double a, double b) {
        if (b != 0) {
            return a / b;
        } else return -1;
    }

    public int mul (int a, int b) {
        return a * b;
    }
}
