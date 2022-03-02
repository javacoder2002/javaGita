package begin;

import java.util.Scanner;

public class Begin26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();


        double t = Math.pow(x - 3, 3);
        double y = 4 * Math.pow(t, 2) - 7 * t + 2;

        System.out.println("y = " + y);

    }
}
