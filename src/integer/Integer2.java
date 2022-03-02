package integer;

import java.util.Scanner;

public class Integer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        int t = (int) m / 1000;
        System.out.println(t);
    }
}
