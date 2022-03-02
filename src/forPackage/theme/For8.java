package forPackage.theme;

import java.util.Scanner;

public class For8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double c;
        for (int i = 1; i <= n; i++)
            for (int j = i; j <= n; j++) {
                c = Math.sqrt(
                        Math.pow(i, 2) + Math.pow(j, 2)
                );
                if (c == Math.floor(c))
                    System.out.println(i + " , " + j + " -> " + c);
            }

    }
}
