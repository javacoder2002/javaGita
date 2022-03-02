package booleanPackage;

import java.util.Scanner;

public class Boolean19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(
                a == -b || b == -c || a == -c
        );
    }
}
