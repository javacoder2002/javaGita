package begin;

import java.util.Scanner;

public class Begin17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double AC = Math.abs(A - C);
        double BC = Math.abs(B - C);

        double sum = AC + BC;

        System.out.println("AC = " + AC);
        System.out.println("BC = " + BC);
        System.out.println("sum = " + sum);

    }

}
