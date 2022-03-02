package booleanPackage.theme;

import java.util.Scanner;

public class Boolean5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(
                m % 2 == 1 && n % 2 == 1
        );

    }
}
