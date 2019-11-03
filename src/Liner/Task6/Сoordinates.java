package Liner.Task6;

/*
Для данной области составить линейную программу, которая печатает true, если точка с координатами (x, y)
принадлежит закрашенной области, и false - в противном случае.
 */

public class Сoordinates {
    public static void main(String[] args) {
        int x = 3;
        int y = -4;

        if (((y >= -3 && y <= 0) && (x >= -4 && x <= 4)) || ((y >=0 && y <= 4) && (x >= -2 && x <= 2)))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
