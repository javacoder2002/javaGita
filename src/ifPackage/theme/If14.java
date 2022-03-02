package ifPackage.theme;

import java.util.Scanner;

public class If14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        boolean ab = a < x && b < y || a < y && b < x;
        boolean ac = a < x && c < y || a < y && c < x;
        boolean bc = a < x && b < y || a < y && b < y;

        System.out.println(
                ab || ac || bc
        );

    }
}
