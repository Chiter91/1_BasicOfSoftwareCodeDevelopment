package cicles.task5;

/*
Даны числовой ряд и некоторое число е.
Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
Общий член ряда имеет вид: an = 1/(2^n) + 2/(3^n)
 */

public class NumberSeries {
    public static void main(String[] args) {
        int n = 10;
        double e = 0.1;
        double sum = 0;
        double temp;
        for (int i = 1; i <= n; i++) {
            temp = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(temp) >= e)
                sum = sum + temp;
        }
        System.out.println(sum);
    }
}
