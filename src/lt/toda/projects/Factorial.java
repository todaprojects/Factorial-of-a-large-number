package lt.toda.projects;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.print("please enter integer number: ");
        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n >= 0 && n <= 1000) {
                    System.out.printf("\nfactorial number: %d! = %d\n", n, factorial(BigInteger.valueOf(n)));
                    break;
                } else {
                    System.out.print("please enter number between 0 and 1000: ");
                }
            } else {
                System.out.print("please enter a valid number: ");
                scanner.next();
            }
        }

    }

    static BigInteger factorial(BigInteger number) {
        if (number.equals(BigInteger.ONE) || number.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        }
        return number.multiply(factorial(number.subtract(BigInteger.ONE)));
    }
}
