package begin;

import java.util.Scanner;

public class Begin10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double sum = a + b;
        double multi = a * b;
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);

        System.out.println("sum = " + sum);
        System.out.println("multi = " + multi);
        System.out.println("a2 = " + a2);
        System.out.println("b2 = " + b2);
    }
}
