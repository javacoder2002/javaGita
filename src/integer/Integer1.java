package integer;

import java.util.Scanner;

public class Integer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l = scanner.nextDouble();
        int m = (int) l / 100;
        System.out.println(m);
    }
}
