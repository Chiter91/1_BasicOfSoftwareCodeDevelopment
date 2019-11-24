package cicles.task6;

/*
Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Unicode {
    public static void main(String[] args) {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            System.out.println((char) i + " - " + i);
        }
    }
}
