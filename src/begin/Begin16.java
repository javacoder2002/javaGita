package begin;

import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();

        double distance = Math.abs(x1 - x2);

        System.out.println("distance = " + distance);
    }
}
