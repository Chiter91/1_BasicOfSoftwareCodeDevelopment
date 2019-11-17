package branching.task3;

/*
Даны три точки А(х1,у1), В(х2,у2) и С(хЗ,уЗ). Определить, будут ли они расположены на одной прямой.
 */

public class Straight {
    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 8;
        int x2 = -2;
        int y2 = -7;
        int x3 = -4;
        int y3 = -17;

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))
            System.out.println("Точки расположены на одной прямой.");
        else System.out.println("Точки НЕ расположены на одной прямой.");
    }
}
