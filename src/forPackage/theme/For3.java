package forPackage.theme;

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int s = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0)
                s = s + i;

        if (s == n)
            System.out.println(s + " perfect number");
        else
            System.out.println(s + " no perfect number");

    }
}
