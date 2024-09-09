import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int number = Integer.MIN_VALUE;
        int answer = Integer.MIN_VALUE;
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        for (; a <= b; a++) {
            int length = Integer.toString(Math.abs(a)).length();
            int temporary = Math.abs(a);
            int sum = 0;
            for (int i = 1; i <= length; i++) {
                sum = (sum + temporary / (int) Math.pow(10, (length - i)));
                temporary = temporary % (int) Math.pow(10, (length - i));
                if (sum > number) {
                    answer = a;
                    number = sum;
                }
            }
        }
        System.out.print(answer);
    }
}
