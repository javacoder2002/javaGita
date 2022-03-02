package casePackage;

import java.util.Scanner;

public class Case6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int measurement = scanner.nextInt();
        double length = scanner.nextDouble();

        switch (measurement){
            case 1 -> System.out.println(length / 10);
            case 2 -> System.out.println(length * 1000);
            case 3 -> System.out.println(length);
            case 4 -> System.out.println(length / 1000);
            case 5 -> System.out.println(length / 100);
            case 6 -> System.out.println("error!");
        }

    }
}
