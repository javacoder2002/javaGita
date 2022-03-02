package integer.theme;

import java.util.Scanner;

public class Integer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int lastDigit = n % 10;
        int firstDigit = n / 10;
        int sumOfDigits = firstDigit + lastDigit;

        System.out.println("lastDigit = " + lastDigit);
        System.out.println("firstDigit = " + firstDigit);
        System.out.println("sumOfDigits = " + sumOfDigits);

    }
}
