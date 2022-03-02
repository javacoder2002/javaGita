package integer;

import java.util.Scanner;

public class Integer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        int n = (int) Math.floor(A / B);
        System.out.println("n = " + n);
    }
}
