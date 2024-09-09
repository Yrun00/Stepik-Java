import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number = Math.abs(scan.nextLong());
        int length = Long.toString(number).length();
        long sum = 0;
        int i = 0;
        long delimiter = (long) Math.pow(10, length);
        do {
            sum = sum + number / delimiter;
            number = number % delimiter;
            delimiter = delimiter / 10;
            i++;
        } while (i <= length
        );
        System.out.println(length + " " + sum);
    }
}
