package begin;

import java.util.Scanner;

public class Begin30 {
    public static void main(String[] args) {
        final double pi = Math.PI;

        Scanner scanner = new Scanner(System.in);
        double radian = scanner.nextDouble();

        double alfa = radian / pi * 180;

        System.out.println(radian + "radan = " + alfa + " degree");
    }
}
