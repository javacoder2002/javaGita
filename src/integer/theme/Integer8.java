package integer.theme;

import java.util.Scanner;

public class Integer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        System.out.printf(
                "%.4f", A / B - Math.floor(A / B)
        );
    }
}
