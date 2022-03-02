package integer;

import java.util.Scanner;

public class Integer21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();
        int minute = sec / 60;
        sec = sec - minute * 60;
        System.out.println(minute + " min " + sec + "sec");
    }
}
