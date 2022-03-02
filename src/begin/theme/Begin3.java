package begin.theme;

import java.util.Scanner;

public class Begin3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double arif = (a + b) / 2;
        double geo = Math.sqrt(a * b);

        System.out.println("arif = " + arif);
        System.out.println("geo = " + geo);

    }
}
