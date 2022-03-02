package ifPackage.theme;

import java.util.Scanner;

public class If8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x <= y)
            x = 0;

        System.out.println(x);
        System.out.println(y);
    }
}
