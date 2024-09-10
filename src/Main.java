import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b = scan.nextInt();
        for (; a < b; a++) {
            BigInteger c = new BigInteger(String.valueOf(a));
            boolean result = c.isProbablePrime(1);
            if (result) {
                System.out.print(a + " ");
            }
        }
    }
}
