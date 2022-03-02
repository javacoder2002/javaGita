package ifPackage;

import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int n = 0;

        if (a > 0) n++;
        if (b > 0) n++;
        if (c > 0) n++;

        System.out.println(n);
    }
}
