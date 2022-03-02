package ifPackage;

import java.util.Scanner;

public class If8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b){
            a = a + b;
            b = a - b;
            a = a - b;
        }

        System.out.println(a);
        System.out.println(b);
    }
}
