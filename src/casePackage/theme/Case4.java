package casePackage.theme;

import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String number;
        switch (n / 10){
            case 1 -> number = "teen";
            case 2 -> number = "twenty";
            case 3 -> number = "thirty";
            case 4 -> number = "forty";
            case 5 -> number = "fifty";
            case 6 -> number = "sixty";
            case 7 -> number = "seventy";
            case 8 -> number = "eighty";
            case 9 -> number = "ninety";
            default -> number = "";
        }

        number = number.concat(" ");

        switch (n % 10) {
            case 1 -> number += "one";
            case 2 -> number += "two";
            case 3 -> number += "three";
            case 4 -> number += "for";
            case 5 -> number += "five";
            case 6 -> number += "six";
            case 7 -> number += "seven";
            case 8 -> number += "eight";
            case 9 -> number += "nine";
            default -> number += "";
        }

        System.out.println(number);

    }
}
