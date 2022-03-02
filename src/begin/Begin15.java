package begin;

import java.util.Scanner;

public class Begin15 {
    public static void main(String[] args) {

        final double pi = Math.PI;
        Scanner scanner = new Scanner(System.in);

        double S = scanner.nextDouble();

        double R = Math.sqrt(S / pi);
        double D = 2 * R;

        System.out.println("Radius = " + R);
        System.out.println("Diameter = " + D);

    }
}
