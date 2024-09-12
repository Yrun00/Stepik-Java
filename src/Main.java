import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrayLength = scan.nextInt();
        int numberForRandom = scan.nextInt();
        Random rand = new Random(numberForRandom);
        int[] list = new int[arrayLength];
        int sum = 0;
        double composition = 1;
        for (int i = 0; i < arrayLength; i++) {
            int a = rand.nextInt(-5, 6);
            list[i] = a;
            System.out.print(a + " ");
            if (a >= 0) {
                sum = sum + a;
            } else {
                composition = composition * a;
            }
        }
        System.out.println();
        System.out.print(sum + " " + composition);
    }
}