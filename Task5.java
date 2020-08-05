package by.jonline.module_1.part_1;

import java.util.Scanner;

/*
 * 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */

public class Task5 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int t = 0;
        int m = 0;
        int n = 0;
        int k = 0;

        do {
            System.out.println("Введите t: ");
            while (!sc.hasNextInt()) {
                System.out.println("Введено неверное число.");
                System.out.println("Введите t: ");
                sc.next();
            }
            t = sc.nextInt();
        } while (t <= 0);

        m = t / 3600;
        t = t % 3600;
        n = t / 60;
        t = t % 60;
        k = t;
        System.out.printf("%dч. %dмин. %dс. ", m, n, k);

    }
}
