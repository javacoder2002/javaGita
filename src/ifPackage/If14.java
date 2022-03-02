package ifPackage;

import java.util.Scanner;

public class If14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double min = a;
        double max = a;

        if (min > b) min = b;
        else if (min > c) min = c;

        if (max < b) max = b;
        else if (max < c) max = c;

        System.out.println(min);
        System.out.println(max);
    }
}
