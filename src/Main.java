import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrayLength = scan.nextInt();
        int numberForRandom = scan.nextInt();
        Random rand = new Random(numberForRandom);
        int[] list = new int[arrayLength];
        int min = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int iMin = 0;
        int iMax = 0;
        for (int i = 0; i < arrayLength; i++) {
            list[i] = rand.nextInt(-5, 16);
            System.out.print(list[i] + " ");
            if (list[i] < 0) {
                min = list[i];
                iMin = i;
            }
            if (list[i] > max) {
                max = list[i];
                iMax = i;
            }
        }
        System.out.println();
        if (min != Integer.MIN_VALUE) {
            int x = list[iMin];
            list[iMin] = list[iMax];
            list[iMax] = x;
        }
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(list[i] + " ");
        }
    }
}