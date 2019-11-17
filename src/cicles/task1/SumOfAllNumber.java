package cicles.task1;

/*
Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class SumOfAllNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число: ");
        int x = sc.nextInt();
        int result = 0;

        for (int i = 0; i < x; i++) {
            result += i;
        }

        System.out.printf("Сумма всех чисел от 1 до %d равна %d.",x, result);
    }
}
