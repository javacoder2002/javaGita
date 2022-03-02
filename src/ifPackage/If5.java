package ifPackage;

import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int n = 0;
        int m = 0;

        if (a > 0) n++;
        else if (a < 0) m++;

        if (b > 0) n++;
        else if (b < 0) m++;

        if (c > 0) n++;
        else if (c < 0) m++;

        System.out.println(n);
        System.out.println(m);
    }
}
