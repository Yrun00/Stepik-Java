import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dayNumber = scan.nextInt();
        String day;
        switch (dayNumber) {
            case 1, 2, 3, 4, 5 -> day = "Working day";
            case 6 -> day = "Saturday";
            case 7 -> day = "Sunday";
            default -> day = "ERROR";

        }
        System.out.println(day);
    }
}
