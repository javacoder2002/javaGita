package ifPackage;

import java.util.Scanner;

public class If12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double min = a;

        if (min > b) min = b;
        if (min > c) min = c;

        System.out.println("min = " + min);

    }
}
