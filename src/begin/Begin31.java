package begin;

import java.util.Scanner;

public class Begin31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Tf = scanner.nextDouble();
        double Tc = (Tf - 32) * (double) 5 / 9;

        System.out.println("Tc = " + Tc);

    }
}
