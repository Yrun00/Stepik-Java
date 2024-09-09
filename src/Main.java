import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int width = scan.nextInt();
        if (height < 1 || width < 1) {
            System.out.print("ERROR");
            return;
        }
        for (int i = 1; i <= height; i++) {
            for (int a = 1; a <= width; a++) {
                if (i == 1 || i == height) {
                    System.out.print("*");
                } else {
                    if (a == 1 || a == width) {
                        System.out.print("*");
                    } else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
