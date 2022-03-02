package ifPackage.theme;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double max, min;

        if (x >= y) {
            max = x;
            min = y;
        } else {
            min = x;
            max = y;
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
