package begin;

import java.util.Scanner;

public class Begin40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A1 = scanner.nextDouble();
        double B1 = scanner.nextDouble();
        double C1 = scanner.nextDouble();
        double A2 = scanner.nextDouble();
        double B2 = scanner.nextDouble();
        double C2 = scanner.nextDouble();

        double D = A1 * B2 - A2 * B1;

        double x = (C1 * B2 - C2 * B1) / D;
        double y = (C2 * A1 - C1 * A2) / D;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
