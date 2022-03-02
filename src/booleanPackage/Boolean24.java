package booleanPackage;

import java.util.Scanner;

public class Boolean24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double D = Math.pow(B, 2) - 4 * A * C;

        System.out.println(
                D >= 0
        );


    }
}
