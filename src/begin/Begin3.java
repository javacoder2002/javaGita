package begin;

import java.util.Scanner;

public class Begin3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double p = (a + b) * 2;
        double area = a * b;

        System.out.println("p = " + p);
        System.out.println("area = " + area);

    }
}
