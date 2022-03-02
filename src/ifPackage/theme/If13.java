package ifPackage.theme;

import java.util.Scanner;

public class If13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double d = Math.pow(b, 2) - 4 * a * c;

        if (d < 0)
            System.out.println("no");
        else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        }else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

    }
}
