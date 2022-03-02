package integer.theme;

import java.util.Scanner;

public class Integer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double d = scanner.nextDouble();
        int n = scanner.nextInt();

        double S = (2 * a + d * (n - 1))* n / 2;

    }
}
