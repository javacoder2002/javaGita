
package booleanPackage.theme;

import java.util.Scanner;

public class Boolean8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println(
                a + b > c && a + c > b && b + c > a
        );

    }
}
