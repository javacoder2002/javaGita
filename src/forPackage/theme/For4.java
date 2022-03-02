package forPackage.theme;

import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int j = 6; j <= n; j++) {
            int s = 0;
            for (int i = 1; i < j; i++)
                if (j % i == 0)
                    s = s + i;
            if (s == j)
                System.out.print(j + ", ");
        }

    }
}
