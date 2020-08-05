package by.jonline.module_1.part_1;

import java.util.Scanner;

/*
 * 6. Для данной области составить линейную программу, которая печатает true,
 * если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
 */

public class Task6 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        
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
        
        if(x >= -2 && x <= 2 && y > 0 && y <= 4 ){
            System.out.println("true");
        }
        else if (x >= -4 && x <= 4 && y <= 0 && y >= -3) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
