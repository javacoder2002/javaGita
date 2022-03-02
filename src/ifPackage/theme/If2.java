package ifPackage.theme;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        double min, max;

        min = x;
        max = y;

        if (x > y){
            min = y;
            max = x;
        }

        if (z > max) max = z;
        if (z < min) min = z;

        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
