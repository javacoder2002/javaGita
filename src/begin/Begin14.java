package begin;

import java.util.Scanner;

public class Begin14 {
    public static void main(String[] args) {
        final double pi = Math.PI;

        Scanner scanner = new Scanner(System.in);

        double L = scanner.nextDouble();

        double R = L / (2 * pi);
        double S = Math.pow(L / 2, 2) / pi;

        System.out.println("R = " + R);
        System.out.println("S = " + S);

    }
}
