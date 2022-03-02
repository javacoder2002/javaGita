package ifPackage;

import java.util.Scanner;

public class If21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x == y && x == 0)
            System.out.println(0);
        else if (y == 0)
            System.out.println(1);
        else if (x == 0)
            System.out.println(2);
        else
            System.out.println(3);

    }
}
