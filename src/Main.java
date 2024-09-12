import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrayLength = scan.nextInt();
        int numberForRandom = scan.nextInt();
        Random rand = new Random(numberForRandom);
        double[] list = new double[arrayLength];
        double sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            double a = rand.nextDouble(0, 5);
            list[i] = a;
            System.out.printf("%.2f", a);
            System.out.print(" ");
            sum = sum + a;
        }
        System.out.println();
        double average = sum / arrayLength;
        System.out.printf("%.2f\n", average);
        for (int i = 0; i < arrayLength; i++) {
            if (list[i] > average) {
                list[i] = average;
            }
            System.out.printf("%.2f", list[i]);
            System.out.print(" ");
        }
    }
}