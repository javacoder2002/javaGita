package begin;

import java.util.Scanner;

public class Begin20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distanceBetweenTwoDot = Math.sqrt(
                Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)
        );

        System.out.println("distanceBetweenTwoDot = " + distanceBetweenTwoDot);

    }
}
