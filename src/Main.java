import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        if (b == 1) {
            System.out.print("NO");
            return;
        }
        BigInteger a = new BigInteger(String.valueOf(b));
        boolean result = a.isProbablePrime(1);
        if (result) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
