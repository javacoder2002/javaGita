package ifPackage;

import java.util.Scanner;

public class If28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        int day;

        if (year % 400 == 0)
            day = 366;
        else if (year % 100 == 0)
            day = 365;
        else if (year % 4 == 0)
            day = 366;
        else
            day = 365;

        System.out.println(day);
    }
}
