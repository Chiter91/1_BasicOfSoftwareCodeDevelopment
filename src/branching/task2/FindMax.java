package branching.task2;

/*
Найти max{min(a, b), min(c, d)}
 */

public class FindMax {
    public static void main(String[] args) {
        int a = 11;
        int b = 5;
        int c = 4;
        int d = 3;

        System.out.println(max(min(a, b), min(c, d)));

    }
    static int min (int x, int y) {
        if (x < y)
            return x;
        else
            return y;
    }
    static int max (int x, int y) {
        if (x < y)
            return y;
        else
            return x;
    }
}
