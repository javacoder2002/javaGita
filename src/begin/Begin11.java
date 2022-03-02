package begin;

import java.util.Scanner;

public class Begin11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double sum = a + b;
        double multi = a * b;
        double aABS = Math.abs(a);
        double bABS = Math.abs(b);

        System.out.println("sum = " + sum);
        System.out.println("multi = " + multi);
        System.out.println("a absolute = " + aABS);
        System.out.println("b absolute = " + bABS);
    }
}
