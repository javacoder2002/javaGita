package booleanPackage;

import java.util.Scanner;

public class Boolean37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println(
                (Math.abs(x1 - x2) == 1 || Math.abs(y1 - y2) == 1) && !(x1 == x2 && y1 == y2)
        );

    }
}
