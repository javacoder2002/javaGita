package booleanPackage;

import java.util.Scanner;

public class Boolean28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.println(
                x > 0 && y > 0 || x < 0 && y < 0
        );

    }
}
