package ifPackage;

import java.util.Scanner;

public class If11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a == b) {
            a = 0;
            b = 0;
        } else
            if (a > b)
                b = a;
            else
                a = b;

        System.out.println(a);
        System.out.println(b);

    }
}
