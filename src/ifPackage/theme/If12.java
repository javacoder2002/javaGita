package ifPackage.theme;

import java.util.Scanner;

public class If12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        if (d >= c && c >= b && b >= a) {
            double max = a;
            if (max < b) max = b;
            if (max < c) max = c;
            if (max < d) max = d;

            a = b = c = d = max;
        } else if (!(a > b && b > c && c > d)) {
            a = Math.pow(a, 2);
            b = Math.pow(b, 2);
            c = Math.pow(c, 2);
            d = Math.pow(d, 2);
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
