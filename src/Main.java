import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long digit = scan.nextLong();
        long sum = digit;
        for (int i = 1; i < digit; i++) {
            if (digit % i == 0) sum = sum + i;
        }

        System.out.println(sum);
    }
}
