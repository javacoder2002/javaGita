package integer;

import java.util.Scanner;

public class Integer20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();
        int hour = sec / 3600;
        System.out.println("hour = " + hour);
    }
}
