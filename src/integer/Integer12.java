package integer;

import java.util.Scanner;

public class Integer12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3
        int a = scanner.nextInt();
        int opposite = a % 10 * 100 + a / 10 % 10 * 10 + a / 100;
        System.out.println("opposite = " + opposite);
    }
}
