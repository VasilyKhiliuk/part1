package by.jonline.module_1.part_1;

import java.util.Scanner;

/*
 * 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

public class Task1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        double z = 0;

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

        z = (a - 3) * b / 2 + c;
        System.out.println("Значение функции равно: " + z);
    }
}