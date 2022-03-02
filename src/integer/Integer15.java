package integer;

import java.util.Scanner;

public class Integer15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(
            a % 10 * 100 + a / 10 % 10 * 10 + a / 100
        );
    }
}
