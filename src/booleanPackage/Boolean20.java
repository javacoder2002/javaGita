package booleanPackage;

import java.util.Scanner;

public class Boolean20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int a1 = a / 100;
        int a2 = a / 10 % 10;
        int a3 = a % 10;

        System.out.println(
                a1 != a2 && a2 != a3 && a1 != a3
        );

    }
}
