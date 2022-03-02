package begin.theme;

import java.util.Scanner;

public class Begin4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int g = 10;

        double H = scanner.nextDouble();
        double time = Math.sqrt((double) 2 * H / g);

        System.out.println("time = " + time);
    }
}
