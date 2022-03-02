package booleanPackage.theme;

import java.util.Scanner;

public class Boolean3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println(
                a * b < 0
        );

    }
}
