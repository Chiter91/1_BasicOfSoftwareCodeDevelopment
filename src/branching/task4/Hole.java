package branching.task4;

/*
Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
Определить, пройдет ли кирпич через отверстие.
 */

public class Hole {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10 + 1);
        int b = (int) (Math.random() * 10 + 1);
        int x = (int) (Math.random() * 10 + 1);
        int y = (int) (Math.random() * 10 + 1);
        int z = (int) (Math.random() * 10 + 1);
        System.out.printf("Размер отверстия %d * %d. Размер кирпича %d * %d * %d.\n", a, b, x, y, z);

        if((a > x) && (b > y) || (a > y) && (b > z) || (a > z) && (b > x)) {
            System.out.println("Кирпич пройдет через отверстие.");
        }
        else {
            System.out.println("Кирпич не пройдет!");
        }
    }
}
