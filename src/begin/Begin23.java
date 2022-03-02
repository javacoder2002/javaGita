package begin;

import java.util.Scanner;

public class Begin23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        A = A + B + C;
        B = A - (B + C);
        C = A - (B + C);
        A = A - (B + C);

        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);

    }
}
