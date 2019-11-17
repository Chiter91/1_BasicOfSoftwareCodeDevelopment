package liner.task3;

/*

Вычислить значение выражения по формуле (все переменные принимают действительные значения:
((Sin x + Cos y) / (Cos x - Sin y)) * Tg xy

 */

public class FormulaSinCos {
    public static void main(String[] args) {
        double x = 1;
        double y = 1;
        double value;

        value = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println(value);


    }
}
