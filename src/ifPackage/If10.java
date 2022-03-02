package ifPackage;

import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a == b) {
            a = 0;
            b = 0;
        } else {
            a = a + b;
            b = a;
        }

        System.out.println(a);
        System.out.println(b);

    }
}
