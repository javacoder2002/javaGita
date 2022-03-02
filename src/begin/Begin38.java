package begin;

import java.util.Scanner;

public class Begin38 {
    public static void main(String[] args) {
        //Ax + B = 0        A != 0
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double x = -B / A;

        System.out.println("x = " + x);
    }
}
