import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 1) {
            System.out.print("ERROR");
            return;
        }
        for (int i = 0; i < number; i++) {
            for (int a = 1; a <= number; a++) {
                if (i < a) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
