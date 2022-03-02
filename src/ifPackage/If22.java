package ifPackage;

import java.util.Scanner;

public class If22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        int n;

        if (x > 0 && y < 0) n = 1;
        else if (x < 0 && y > 0) n = 2;
        else if (x < 0 && y < 0) n = 3;
        else n = 4;

        System.out.println(n);

    }
}
