package integer;

import java.util.Scanner;

public class Integer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(
                n % 10
        );
        System.out.println(
                n / 10 % 10
        );
    }
}
