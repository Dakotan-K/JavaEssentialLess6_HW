package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите кол-во метров: ");
        Scanner in = new Scanner(System.in);
        double metrs = in.nextDouble();

        System.out.println("Перевод м в км: " + Distance.Converter.mFromKm(metrs));

        System.out.print("Введите кол-во киллометров: ");
        Scanner in1 = new Scanner(System.in);
        double km = in1.nextDouble();

        System.out.println("Перевод км в мили: " + Distance.Converter.kmFromMils(km));
    }
}
