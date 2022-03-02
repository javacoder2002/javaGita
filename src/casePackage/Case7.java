package casePackage;

import java.util.Scanner;

public class Case7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int measurement = scanner.nextInt();
        double weight = scanner.nextDouble();

        switch (measurement){
            case 1 -> System.out.println(weight);
            case 2 -> System.out.println(weight / 1000000);
            case 3 -> System.out.println(weight / 1000);
            case 4 -> System.out.println(weight * 1000);
            case 5 -> System.out.println(weight * 100);
            case 6 -> System.out.println("error!");
        }

    }
}
