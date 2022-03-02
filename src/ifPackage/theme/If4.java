package ifPackage.theme;

import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println(a + " > " + b + " > " + c);
        if (a > b && b > c)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
