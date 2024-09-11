import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int max = maxNumberDivider(a, b);
        System.out.println(max);
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        BigInteger a = new BigInteger(String.valueOf(number));
        return a.isProbablePrime(10);
    }

    static int simpleInRange(int a, int b) {
        int c;
        if (a > b) {
            c = a;
            a = b;
            b = c;
        }
        c = 0;
        for (; a <= b; a++) {
            if (isPrime(a)) c++;
        }
        return c;
    }

    static int maxNumberDivider(int a, int b) {
        int maxNumber = 0;
        int maxValue = 0;
        for (; a <= b; a++) {
            int nOD = numberOfDivisors(a);
            if (nOD > maxValue) {
                maxValue = nOD;
                maxNumber = a;
            }
        }
        return maxNumber;
    }

    static int numberOfDivisors(int number) {
        int numberOfDivisors = 0;
        for (long i = 1; i <= number; i++) {
            if (number % i == 0) {
                numberOfDivisors++;
            }
        }
        return numberOfDivisors;
    }
}