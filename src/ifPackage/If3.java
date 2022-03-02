package ifPackage;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a > 0)
            a++;
        else if (a < 0)
            a -= 2;
        else
            a = 10;

        System.out.println(a);
    }
}
