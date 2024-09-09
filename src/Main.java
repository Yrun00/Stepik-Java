import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ab = scan.nextInt();
        int bc = scan.nextInt();
        int weight = scan.nextInt();
        int rate = 0;
        final int tank = 300;
        if (weight <= 500 && weight > 0) rate = 1;
        else if (weight <= 1000) rate = 4;
        else if (weight <= 1500) rate = 7;
        else if (weight <= 2000) rate = 9;

        if (ab * rate <= tank && bc * rate <= tank && rate != 0) {
            if ((ab + bc) * rate < tank) {
                System.out.printf("%5.2f\n", 0.0);
                return;
            }
            System.out.printf("%5.2f\n", (float) (Math.abs((ab+bc)*rate-tank)));
        } else System.out.println("ERROR");
    }
}
//200 200 - 100
//250 250 - 200
//300 300 - 300
//300 100 - 100
//50 300 - 250