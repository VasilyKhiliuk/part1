package by.jonline.module_1.part_1;

import java.util.Scanner;

/*
 * 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y = 0;

        System.out.println("Введите число R вида nnn.ddd: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Введено неверное число.");
            System.out.println("Введите число R вида nnn.ddd: ");
            sc.next();
        }
        x = sc.nextDouble();
        sc.close();

        System.out.println("Начальное число: " + x);
        x = x * 1000;
        y = y + x % 10;
        x = x - x % 10;
        y = y + x % 100;
        x = x - x % 100;
        y = y + x % 1000;
        x = x - x % 1000;
        y = y + x % 10000 * 0.000001;
        x = x - x % 10000;
        y = y + x % 100000 * 0.000001;
        x = x - x % 100000;
        y = y + x % 1000000 * 0.000001;

        System.out.println("Конечное число: " + y);
    }
}
