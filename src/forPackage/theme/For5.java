package forPackage.theme;

import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int j = 1; j <= n; j++)
            if (j % 3 == 0 && j % 5 != 0)
                System.out.print(j + ", ");

    }
}
