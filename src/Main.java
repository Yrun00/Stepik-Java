import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        System.out.printf("%.2f %.2f\n", average(a, b), average(a, b, c));
        System.out.printf("%.2f %.2f\n", average(x, y), average(x, y, z));
    }

    static double average(double a, double b) {
        return (a + b) / 2.0d;
    }

    static double average(double a, double b, double c) {
        return (a + b + c) / 3.0d;
    }

    static double square(double a) {
        return (a * a);
    }

    static double square(double a, double b) {
        return (a * b);
    }

    static void printTriangle(int number, char symbol) {
        if (number < 1) {
            System.out.print("ERROR");
            return;
        }
        for (int i = 0; i < number; i = i + 2) {

            for (int z = number / 2 - i / 2 + number % 2 - 1; z > 0; z--) {
                System.out.print(" ");
            }
            for (int z = number % 2 - 1; z <= i; z++) {

                System.out.print(symbol);
            }
            System.out.println();
        }
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