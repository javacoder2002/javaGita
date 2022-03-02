package booleanPackage;

import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(
                (x + y) % 2 == 1
        );

    }
}
