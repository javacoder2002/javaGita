package booleanPackage;

import java.util.Scanner;

public class Boolean29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println(
                x > x2 && x < x1 && y > y1 && y < y2
        );
    }
}
