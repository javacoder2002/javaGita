package begin;

import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double c = Math.sqrt(a * a + b * b);
        double p = a + b + c;

        System.out.println("c = " + c);
        System.out.println("p = " + p);

    }
}
