package integer;

import java.util.Scanner;

public class Integer23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();
        int hour = sec / 3600;
        int minute = sec % 3600 / 60;
        sec = sec % 60;
        System.out.println("hour = " + hour);
        System.out.println("minute = " + minute);
        System.out.println("sec = " + sec);
    }
}
