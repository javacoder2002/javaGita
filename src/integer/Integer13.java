package integer;

import java.util.Scanner;

public class Integer13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(
                a % 100 * 10 + a / 100
        );
    }
}
