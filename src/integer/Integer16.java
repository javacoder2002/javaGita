package integer;

import java.util.Scanner;

public class Integer16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(
                a / 100 * 100 + a % 10 * 10 + a / 10 % 10
        );
    }
}
