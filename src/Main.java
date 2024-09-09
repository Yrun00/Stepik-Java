import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        int bads = 0;
        for (int i = 0; i < 9; i++) {
            if (grade<4){
                bads++;
            }
            grade = scan.nextInt();
        }
        System.out.println(bads);
    }
}
