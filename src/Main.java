import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digits = scan.nextInt();
        int min = scan.nextInt();
        for (int i = 1; i < digits; i++) {
            int number = scan.nextInt();
            if (min > number) min = number;
        }

        System.out.println(min);
    }
}
