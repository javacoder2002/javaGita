package booleanPackage;

import java.util.Scanner;

public class Boolean8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println(
                a % 2 == 1 && b % 2 == 1
        );
    }
}
