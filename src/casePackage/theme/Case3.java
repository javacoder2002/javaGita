package casePackage.theme;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case 1 -> System.out.println("December, January, February");
            case 2 -> System.out.println("March, April, May");
            case 3 -> System.out.println("June, July, August");
            case 4 -> System.out.println("September, October, November");
            default -> System.out.println("Season not found!");
        }
    }
}
