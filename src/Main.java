import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printDivider(number);
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

    static void printDivider(int number) {
        for (long i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}