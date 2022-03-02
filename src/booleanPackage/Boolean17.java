package booleanPackage;

import java.util.Scanner;

public class Boolean17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(
                a % 2 == 1 && a > 99 && a < 1000
        );
    }
}
