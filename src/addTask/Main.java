package addTask;

public class Main {
    public static void main(String[] args) {

        int a = 10, b = 20;

        Calculator calculator = new Calculator();

        System.out.println("Сложение а и b: " + calculator.sum(a,b));
        System.out.println("Вычитание а и b: " + calculator.sub(a,b));
        System.out.println("Умножение а на b: " + calculator.mul(a,b));
        System.out.println("Деление а на b: " + calculator.div(a,b));

    }
}
