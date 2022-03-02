package begin.theme;

import java.util.Scanner;

public class Begin6 {
    public static void main(String[] args) {

        final double pi = Math.PI;
        final double g = 9.81;

        Scanner scanner = new Scanner(System.in);
        double L = scanner.nextDouble();

        double T = 2 * pi * Math.sqrt(L / g);

        System.out.println("T = " + T);
    }
}
