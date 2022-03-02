package begin.theme;

import java.util.Scanner;

public class Begin7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double V1 = scanner.nextDouble();
        double V2 = scanner.nextDouble();
        double t1 = scanner.nextDouble();
        double t2 = scanner.nextDouble();

        double t =
                ((V1 + V2) * t2 + V1 * t1)
                        /
                        (2 * V1 + V2);

        System.out.println("t = " + t);
    }
}
