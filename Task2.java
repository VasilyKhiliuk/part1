package by.jonline.module_1.part_1;

import java.util.Scanner;

/*
 * 2. Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения):
 * (b + sqrt(pow(b,2) + 4 * a * c)) / 2 / a - pow(a,3) * c + pow(b,-2)
 */

public class Task2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        double f = 0;

        System.out.println("Введите a: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Введено неверное число.");
            System.out.println("Введите a: ");
            sc.next();
        }
        a = sc.nextDouble();

        System.out.println("Введите b: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Введено неверное число.");
            System.out.println("Введите b: ");
            sc.next();
        }
        b = sc.nextDouble();

        System.out.println("Введите c: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Введено неверное число.");
            System.out.println("Введите c: ");
            sc.next();
        }
        c = sc.nextDouble();

        f = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 / a - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Значение функции равно: " + f);
    }
}
