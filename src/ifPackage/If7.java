package ifPackage;

import java.util.Scanner;

public class If7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int n = 1;
        if (a > b) n = 2;

        System.out.println(n);
    }
}
