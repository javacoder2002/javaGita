package begin.theme;

import java.util.Scanner;

public class Begin8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double R1 = scanner.nextDouble();
        double R2 = scanner.nextDouble();
        double R3 = scanner.nextDouble();

        double R =
                R1 * R2 * R3
                        /
                        R1 * R2 + R2 * R3 + R1 * R3;

        System.out.println("R = " + R);

    }
}
