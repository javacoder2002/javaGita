package ifPackage;

import java.util.Scanner;

public class If9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        System.out.println(a);
        System.out.println(b);

    }
}
