package cicles.task8;

/*
Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class RepeatingNumbers {
    public static void main(String[] args) {
        int x = 20357;
        int y = 253067890;
        int tempX;
        int tempY;

        for (int i = x; i > 0; i /= 10) {
            tempX = i % 10;

            for (int j = y; j > 0; j /= 10) {
                tempY = j % 10;
                if (tempX == tempY) {
                    System.out.println("Цифра " + tempX + " содержится в двух числах");
                    break;
                }
            }
        }
    }
}
