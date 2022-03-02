package ifPackage.theme;

import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x < y) {
            x = (x + y) / 2;
            y = 2 * (x * 2 - y) * y;
        }else {
            y = (x + y) / 2;
            x = 2 * (2 * y - x) * x;
        }

        System.out.println(x);
        System.out.println(y);
    }
}
