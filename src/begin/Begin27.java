package begin;

import java.util.Scanner;

public class Begin27 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();

        double A2 = Math.pow(A, 2);
        double A4 = Math.pow(A, 4);
        double A8 = Math.pow(A, 8);

        System.out.println("the second level of A: " + A2);
        System.out.println("the fourth level of A: " + A4);
        System.out.println("the eighth level of A: " + A8);

    }
}
