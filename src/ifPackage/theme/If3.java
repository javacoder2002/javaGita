package ifPackage.theme;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        double min, max;

        max = x * y * z;
        if (x + y + z > x * y * z)
            max = x + y + z;

        min = x * y * z;
        if (min > x + y + z / 2)
            min = x + y + z / 2;

        System.out.println(max);
        System.out.println(min * min + 1);

    }
}
