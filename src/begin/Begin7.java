package begin;

import java.util.Scanner;

public class Begin7 {
    public static void main(String[] args) {
        final double pi = Math.PI;

        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();

        double length = 2 * pi * r;
        double area = pi * Math.pow(r ,2);

        System.out.println("length = " + length);
        System.out.println("area = " + area);
    }
}
