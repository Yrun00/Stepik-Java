import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long digit = scan.nextLong();
        long sum = 0;
        int dilimeter;
        do {

            dilimeter = scan.nextInt();
            if (dilimeter < 0) continue;
            if (digit % dilimeter == 0) sum++;
        } while (dilimeter > 0);
        System.out.println(sum);
    }
}
