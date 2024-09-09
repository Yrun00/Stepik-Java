import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = number; 0 < i; i--) {
            for (int a = i; 0 < a; a--) {
                System.out.print(number);
            }
            number--;
            System.out.println("");
        }
    }
}
