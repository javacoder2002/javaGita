package begin;

import java.util.Scanner;

public class Begin39 {
    public static void main(String[] args) {
        //Ax^2 + Bx + c = 0        A != 0, D > 0
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double D = Math.pow(B, 2) - 4 * A * C;

        double x1 = (-B + Math.sqrt(D)) / (2 * A);
        double x2 = (-B - Math.sqrt(D)) / (2 * A);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
