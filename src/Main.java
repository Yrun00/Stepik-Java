import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long sum = 0;
        for (long i = 2; i < a; i = i + 2) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        System.out.print(sum);
    }
}
