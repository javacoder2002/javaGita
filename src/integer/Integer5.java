package integer;

import java.util.Scanner;

public class Integer5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        int n = (int) Math.floor(A / B);
        double last = A - B * n;

        System.out.println("n = " + n);
        System.out.println("last = " + last);

    }
}
