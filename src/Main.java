import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrayLength = scan.nextInt();
        int[] list = new int[arrayLength];
        int min = Integer.MAX_VALUE;
        int iMin = 0;
        for (int i = 0; i < arrayLength; i++) {
            list[i] = scan.nextInt();
            if (list[i] <= min) {
                min = list[i];
                iMin = i;
            }
        }
        list[iMin] = -1;
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(list[i] + " ");
        }
    }
}