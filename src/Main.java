import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 1) {
            System.out.print("ERROR");
            return;
        }
        for (int i = 0; i < number; i = i + 2) {
            int z = i;
            while ((z - 2 >= 0)) {
                z = z - 2;
                System.out.print(" ");
            }
            for (int a = 1; a <= number; a++) {

                if (i < a) System.out.print("*");
            }
            System.out.println();
        }
    }
}
