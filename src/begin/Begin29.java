package begin;

import java.util.Scanner;

public class Begin29 {
    public static void main(String[] args) {

        final double pi = Math.PI;

        Scanner scanner = new Scanner(System.in);

        double alfa = scanner.nextDouble();

        double radian = alfa / 180 * pi;

        System.out.println(alfa + " degree = " + radian + " radian");

    }
}
