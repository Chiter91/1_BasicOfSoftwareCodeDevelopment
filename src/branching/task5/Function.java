package branching.task5;

/*
                                  | (x^2)-3x+9, если x<=3;
Вычислить значение функции: F(x)= |
                                  | 1/((x^3)+6), если x > 3;
 */

public class Function {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 6) + 1;
        double result;

        if (x <= 3) {
            result = (Math.pow(x, 2)) - 3 * x + 9;
        }
        else
            result = 1 / ((Math.pow(x, 3)) + 6);
        System.out.printf("При x равном %d, результатом функции будет: %s",x, result);
    }
}
