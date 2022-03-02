package booleanPackage.theme;

import java.util.Scanner;

public class Boolean2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println(
                a < 0 || b < 0
        );

    }
}
