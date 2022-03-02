package booleanPackage;

import java.util.Scanner;

public class Boolean4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(
                a > 2 && b <= 3
        );
    }
}
