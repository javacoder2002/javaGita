package casePackage;

import java.util.Scanner;

public class Case5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        int n = scanner.nextInt();

        switch (n){
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
            case 3 -> System.out.println(a / b);
            case 4 -> System.out.println(a * b);
            default -> System.out.println("error!");
        }


    }
}
