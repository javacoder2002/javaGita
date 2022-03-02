package ifPackage;

import java.util.Scanner;

public class If18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        int n = 1;
        if (a == b)
            n = 3;
        else if (a == c)
            n = 2;

        System.out.println(n);
    }
}
