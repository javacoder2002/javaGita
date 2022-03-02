package integer;

import java.util.Scanner;

public class Integer22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();
        int hour = sec / 3600;
        sec = sec % 3600;
        System.out.println(hour + " hour " + sec + " sec");
    }
}
