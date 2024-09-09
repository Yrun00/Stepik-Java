import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.next().toUpperCase();
        switch (day) {
            case "ПОНЕДЕЛЬНИК" -> day = "Monday";
            case "ВТОРНИК" -> day = "Tuesday";
            case "СРЕДА" -> day = "Wednesday";
            case "ЧЕТВЕРГ" -> day = "Thursday";
            case "ПЯТНИЦА" -> day = "Friday ";
            case "СУББОТА" -> day = "Saturday";
            case "ВОСКРЕСЕНЬЕ" -> day = "Sunday";
            default -> day = "ERROR";

        }
        System.out.println(day);
    }
}
