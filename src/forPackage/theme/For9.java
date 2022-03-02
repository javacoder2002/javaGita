package forPackage.theme;

import java.util.Scanner;

public class For9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {

                    int si = 0;
                    int sj = 0;

                    for (int k = 1; k < i; k++)
                        if (i % k == 0)
                            si = si + k;

                    for (int k = 1; k < j; k++)
                        if (j % k == 0)
                            sj = sj + k;

                    if (sj == i && si == j)
                        System.out.println(i + " <-> " + j);

            }
        }

    }
}
