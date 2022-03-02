package ifPackage;

import java.util.Scanner;

public class If20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double ab = Math.abs(a - b);
        double ac = Math.abs(a - c);

        if (ab > ac)
            System.out.println("b, " + ab);
        else
            System.out.println("c, " + ac);

    }
}
