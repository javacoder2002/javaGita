package ifPackage.theme;

import java.util.Scanner;

public class If11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        if (x > 0) System.out.println(Math.pow(x ,2));
        if (y > 0) System.out.println(Math.pow(y ,2));
        if (z > 0) System.out.println(Math.pow(z ,2));

    }
}
