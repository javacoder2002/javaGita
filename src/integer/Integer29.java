package integer;

import java.util.Scanner;

public class Integer29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        System.out.println(
                A / C + B / C
        );

    }
}
