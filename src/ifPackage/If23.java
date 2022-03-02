package ifPackage;

import java.util.Scanner;

public class If23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double x4, y4;

        if (x1 == x2)
            x4 = x3;
        else if (x1 == x3)
            x4 = x2;
        else
            x4 = x1;

        if (y1 == y2)
            y4 = y3;
        else if (y1 == y3)
            y4 = y2;
        else
            y4 = y1;

    }
}
