package ifPackage.theme;

import java.util.Scanner;

public class If9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        if (x > 1 && x < 3) System.out.println(x);
        if (y > 1 && y < 3) System.out.println(y);
        if (z > 1 && z < 3) System.out.println(z);

    }
}
