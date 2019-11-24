package cicles.task7;

/*
Для каждого натурального числа в промежутке от m до n вывести все делители,
кроме единицы и самого числа, m и n вводятся с клавиатуры.
 */

import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два разных целых числа через пробел");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x < y) {
            for (int i = x; i <= y; i++) {
                System.out.print("\nУ числа " + i + " следующие делители: ");
                for (int j = 2; j <= i/2; j++) {
                    if (i % j == 0) {
                        System.out.print(j + " ");
                    }
                }
            }
        } else {
            for (int i = y; i <= x; i++) {
                System.out.print("\nУ числа " + i + " следующие делители: ");
                for (int j = 2; j <= i/2; j++) {
                    if (i % j == 0) {
                        System.out.print(j + " ");
                    }
                }
            }
        }
    }
}
