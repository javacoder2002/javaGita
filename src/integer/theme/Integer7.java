package integer.theme;

import java.util.Scanner;

public class Integer7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        System.out.println(
                Math.floor(A / B)
        );

    }
}
