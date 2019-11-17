package cicles.task2;

/*
                                                           |  x, x > 2
Вычислить значения функции на отрезке [а,Ь] с шагом h: y = |
                                                           | -x, x <= 2
 */

public class Function {
    public static void main(String[] args) {
        int x;
        int a = -3;
        int b = 4;
        int h = 2;
        int result;

        for(int i = a; i <= b; i += h) {
            x = i;
            if (x > 2)
                result = x;
            else
                result = -x;
            System.out.printf("При Х = %d, Y = %d\n",x, result);
        }
    }
}
