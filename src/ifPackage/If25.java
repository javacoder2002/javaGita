package ifPackage;

import java.util.Scanner;

public class If25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = x < -2 || x > 2 ? 2 * x : -3 * x;

        System.out.println(y);
    }
}
