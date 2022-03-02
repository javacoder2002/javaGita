package ifPackage;

import java.util.Scanner;

/**
 * positive, negative, pair, odd
 */

public class If29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a == 0)
            System.out.println("zero");
        else {
            if (a > 0) {
                if (a % 2 == 0)
                    System.out.println("positive pair number");
                else
                    System.out.println("positive odd number");
            } else {
                if (a % 2 == 0)
                    System.out.println("negative pair number");
                else
                    System.out.println("negative odd number");
            }
        }
    }
}
