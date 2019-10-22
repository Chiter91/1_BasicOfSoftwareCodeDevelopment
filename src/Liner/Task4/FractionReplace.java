package Liner.Task4;

/*

Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывисти полученное значение числа.

 */

public class FractionReplace {
    public static void main (String[] args) {
        double number = 539.499;
        double wholePart = (int) number;
        double fractionPart = (number - wholePart) * 1000;
        number = fractionPart + (wholePart / 1000);

        System.out.printf("Число: %.3f", number);
    }
}
