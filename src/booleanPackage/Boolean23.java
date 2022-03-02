package booleanPackage;

import java.util.Scanner;

public class Boolean23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int a1 = a / 100;
        int a3 = a % 10;

        System.out.println(
                a1 == a3
        );

    }
}
