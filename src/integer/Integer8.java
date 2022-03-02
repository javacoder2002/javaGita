package integer;

import java.util.Scanner;

public class Integer8 {
    public static void main(String[] args) {
        //_ab
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n = n % 10 * 10 + n / 10;
        System.out.println(n);
    }
}
