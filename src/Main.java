import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b = scan.nextInt();
        if (a > b) {
            long c = a;
            a = b;
            b = c;
        }
        for (; a <= b; a++) {
            BigInteger c = new BigInteger(String.valueOf(a));
            boolean result = c.isProbablePrime(10);
            if (!result) {
                if (a == 1) continue;
                System.out.print(a);
                return;
            }
        }
        System.out.print("NO");
    }
}
