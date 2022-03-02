package begin;

import java.util.Scanner;

public class Begin4 {
    public static void main(String[] args) {

        final double pi = Math.PI;

        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();

        double length = pi * d;

        System.out.println("length = " + length);

    }
}
