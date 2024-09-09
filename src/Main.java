import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        double answer = 1;
        if (b < a) {
            int c = a;
            a = b;
            b = c;
        }
        while (a <= b) {
            answer = answer * a;
            a++;
        }
        System.out.println(answer);
    }
}
