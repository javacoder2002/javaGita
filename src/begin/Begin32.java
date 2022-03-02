package begin;

import java.util.Scanner;

public class Begin32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Tc = scanner.nextDouble();
        double Tf = Tc * (double) 9 / 5 + 32;

        System.out.println("Tf = " + Tf);
    }
}
