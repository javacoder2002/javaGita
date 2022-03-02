package ifPackage;

import java.util.Scanner;

public class If26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        double y;
        if (x <= 0)
            y = -x;
        else if (x >= 2)
            y = 4;
        else
            y = Math.pow(x, 2);

        System.out.println(y);

    }
}
