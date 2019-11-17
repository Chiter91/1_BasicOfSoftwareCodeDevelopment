package liner.task5;

/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc
 */

import java.util.Scanner;

public class TimeInSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Введите количество секунд: ");
        int second = sc.nextInt();
        int minute = second / 60 % 60;
        int hour = second / 60 / 60;
        second %= 60;

        System.out.print(hour + "ч " + minute + "мин " + second + "с");
    }
}