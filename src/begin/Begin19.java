package begin;

import java.util.Scanner;

public class Begin19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double a = Math.abs(x1 - x2);
        double b = Math.abs(y1 - y2);

        double p = (a + b) * 2;
        double s = a * b;

        System.out.println("perimeter = " + p);
        System.out.println("area = " + s);
    }
}
