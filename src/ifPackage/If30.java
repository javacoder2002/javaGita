package ifPackage;

import java.util.Scanner;

/**
 * positive, negative, pair, odd
 */

public class If30 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a / 100 > 0){
            if (a % 2 == 0)
                System.out.println("3 xonali juft son");
            else
                System.out.println("3 xonali toq son");
        }else if (a / 10 > 0){
            if (a % 2 == 0)
                System.out.println("2 xonali juft son");
            else
                System.out.println("2 xonali toq son");
        }else {
            if (a % 2 == 0)
                System.out.println("1 xonali juft son");
            else
                System.out.println("1 xonali toq son");
        }

    }
}
