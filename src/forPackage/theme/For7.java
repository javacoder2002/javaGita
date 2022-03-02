package forPackage.theme;

import java.util.Scanner;

public class For7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int j = 2; j <= n; j++) {
            boolean t = true;

            for (int i = 2; i < j; i++)
                if (j % i == 0) {
                    t = false;
                    break;
                }

            if (t)
                System.out.println(j);
        }
    }
}
