import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 1) {
            System.out.print("ERROR");
            return;
        }
        for (int i = 1; i <= number; i++) {

            for (int a = 1; a <= number; a++) {
                System.out.printf(("%d\t"), i * a);

            }
            System.out.println();
        }
    }
}
