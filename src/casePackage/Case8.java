package casePackage;

import java.util.Scanner;

public class Case8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int d = scanner.nextInt();
        int m = scanner.nextInt();

        String day;
        String month;

        switch (m) {
            case 1 -> month = "January";
            case 2 -> month = "February";
            case 3 -> month = "Match";
            case 4 -> month = "April";
            case 5 -> month = "May";
            case 6 -> month = "June";
            case 7 -> month = "July";
            case 8 -> month = "August";
            case 9 -> month = "September";
            case 10 -> month = "October";
            case 11 -> month = "November";
            case 12 -> month = "December";
            default -> month = "Month not exist!";
        }


    }
}
