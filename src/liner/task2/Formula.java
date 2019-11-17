package liner.task2;

/*

Вычислить значение выражения по формуле (все переменные принимают действительные значения):
((b+sqrt(b^2+4ac))/(2*a))-a^3*c+b^-2

 */

public class Formula {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 5.0;
        double x;

        x = ((b + Math.sqrt(Math.pow(b,2) + 4 * a * c))/(2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println(x);

    }
}
