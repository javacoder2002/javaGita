package ifPackage;

import java.util.Scanner;

public class If27 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        double y;
        if (x<0)
            y = 0;
        else if (Math.floor(x) % 2 == 0)
            y = 1;
        else
            y = -1;


    }
}
