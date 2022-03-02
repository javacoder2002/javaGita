package ifPackage;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        a = a > 0 ? a + 1 : a - 2;
        System.out.println(a);
    }
}
