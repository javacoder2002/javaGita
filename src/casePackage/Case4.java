package casePackage;

import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        switch (n) {
            case 1, 3, 5, 8, 10, 12 -> System.out.println(30);
            case 4, 6, 7, 9, 11 -> System.out.println(31);
            case 2 -> System.out.println(28);
            default -> System.out.println("error!");
        }

    }
}
