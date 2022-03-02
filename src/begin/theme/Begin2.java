package begin.theme;

import java.util.Scanner;

public class Begin2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double area = a * b / 2;

        System.out.println("c = " + c);
        System.out.println("area = " + area);
    }

}
