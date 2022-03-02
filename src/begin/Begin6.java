package begin;

import java.util.Scanner;

public class Begin6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double volume = a * b * c;
        double area = 2 * (a * b + b * c + a * c);

        System.out.println("volume = " + volume);
        System.out.println("area = " + area);
    }
}
