
package booleanPackage.theme;

import java.util.Scanner;

public class Boolean7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println(
                c * c == a * a + b * b
        );

    }
}
