package booleanPackage;

import java.util.Scanner;

public class Boolean16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(
                a % 2 == 0 && a > 9 && a < 100
        );
    }
}
