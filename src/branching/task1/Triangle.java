package branching.task1;

/*
Даны два угла треугольника (в градусах).
Определить существует ли такой треугольник, и если да, то будет ли он прямоугольниы.
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Введите размер первого угла треугольника в градусах: ");
        int a = sc.nextInt();
        System.out.print("Введите размер второго угла треугольника в градусах: ");
        int b = sc.nextInt();

        if (((180 - a - b) > 0) && (a != 0 && b != 0))
            System.out.printf("Треугольник с углами %d° и %d° существует!", a, b);
        else {
            System.out.printf("Треугольник с углами %d° и %d° НЕ существует!", a, b);
            return;
        }

        if (((a + b) == 90) || (a == 90 || b == 90))
            System.out.println("\nЭтот треугольник является прямоугольным.");

    }
}