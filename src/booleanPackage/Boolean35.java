package booleanPackage;

import java.util.Scanner;

public class Boolean35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println(
                (x1 + y1) % 2 == (x2 + y2) % 2
        );

    }
}
