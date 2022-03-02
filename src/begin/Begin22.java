package begin;

import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        //A = a, B = b
        A = A + B; //A = a + b
        B = A - B; //B = A - B = a + b - b = a = A ,      -> B = A
        A = A - B; //A = A - B = a + b - a = b = B ,      -> A = B

        System.out.println("A = " + A);
        System.out.println("B = " + B);

    }
}
