package cicles.task4;

/*
Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

import java.math.BigInteger;

public class ProductOfSquares {
    public static void main(String[] args) {
        BigInteger result = BigInteger.valueOf(1);

        for(int i = 1; i <= 200; i ++) {
            BigInteger pow = BigInteger.valueOf(i).pow(2);
            result = result.multiply(pow);
        }
        System.out.println(result);
    }
}
