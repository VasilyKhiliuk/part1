package by.jonline.module_1.part_1;

import java.util.Scanner;

/*
 * 3. Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения):
 * (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y)
 */

public class Task3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        double x = 0;
        double y = 0;
        double z = 0;

        System.out.println("Введите x: ");
        while (!sc.hasNextInt()) {
            System.out.println("Введено неверное число.");
            System.out.println("Введите x: ");
            sc.next();
        }
        x = sc.nextInt();

        System.out.println("Введите y: ");
        while (!sc.hasNextInt()) {
            System.out.println("Введено неверное число.");
            System.out.println("Введите y: ");
            sc.next();
        }
        y = sc.nextInt();

        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("Значение функции равно: " + z);

    }
}
