import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String line = scan.nextLine();
        scan.close();
        scan = new Scanner(line);
        while (scan.hasNextInt()) {
            int number = scan.nextInt();
            list.add(number);
        } ;
        int min = list.get(0);
        for (Integer integer : list) {
            if (min > integer) min = integer;
        }
        System.out.println(min);
    }
}