package integer;

import java.util.Scanner;

public class Integer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //_abc
        int a = scanner.nextInt();
        int s = a / 100 + a / 10 % 10 + a % 10;
        System.out.println(s);
    }
}
