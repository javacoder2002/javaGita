package begin.theme;

import java.util.Scanner;

public class Begin1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side of cube: ");
        double a = scanner.nextDouble();

        //to calculate volume of cube: V = a * a * a .
        double V = Math.pow(a, 3);

        //are of cube: S = 6 * a * a .
        double S = 6 * Math.pow(a, 2);

        System.out.println("volume of cube = " + V);
        System.out.println("area of cube = " + S);

    }
}
