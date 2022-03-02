package begin.theme;

import java.util.Scanner;

public class Begin9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double answer =
                (Math.abs(x) - Math.abs(y))
                        /
                        (1 + Math.abs(x * y));

        System.out.println("answer = " + answer);

    }
}
