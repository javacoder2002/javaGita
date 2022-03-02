package ifPackage;

import java.util.Scanner;

public class If24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        double y = x > 0 ? 2 * Math.sin(x) : x - 6;

        System.out.println(y);

    }
}
