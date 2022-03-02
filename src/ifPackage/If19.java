package ifPackage;

import java.util.Scanner;

public class If19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        int n = 1;

        if (a == b && b == c)
            n = 4;
        else if (a == b && b == d)
            n = 3;
        else if (a == c && c == d)
            n = 2;

        System.out.println(n);
    }
}
