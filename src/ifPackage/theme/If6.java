package ifPackage.theme;

import java.util.Scanner;

public class If6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double z;

        if (x > y) z = x - y;
        else z = y - x + 1;


    }
}
