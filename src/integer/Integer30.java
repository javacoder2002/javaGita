package integer;

import java.util.Scanner;

public class Integer30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(year / 100 + 1);
    }
}
