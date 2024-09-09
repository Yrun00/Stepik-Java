import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();
        float salary = scan.nextFloat();
        if (hours < 0 | salary < 0) {
            System.out.println("ERROR");
            return;
        }
        float pay = 0;
        int iq = 0;
        if (hours > 0 && hours <= 20) {
            iq = 1;
        } else if (hours > 20 && hours <= 40) {
            iq = 2;
        } else if (hours > 40) {
            iq = 3;
        }
        switch (iq) {
            case (1):
                pay = hours * salary;
                break;
            case (2):
                pay = 20 * salary+(hours-20)*salary*1.5F;
                break;
            case (3):
                pay = 20 * salary+(20)*salary*1.5F+(hours-40)*salary*2;
                break;
            default:
                break;
        }

        System.out.printf("%5.2f\n", pay);

    }
}