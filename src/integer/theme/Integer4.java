package integer.theme;

import java.util.Scanner;

public class Integer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double c = scanner.nextDouble();
        double a = scanner.nextDouble();

        double b = Math.sqrt(
                Math.pow(c, 2) - Math.pow(a, 2)
        );

        double r = (a + b + c) / (a * b);

        System.out.println("b = " + b);
        System.out.println("radius = " + r);
    }
}
