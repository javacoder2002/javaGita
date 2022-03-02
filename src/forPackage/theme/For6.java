package forPackage.theme;

import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean t = true;

        for (int i = 2; i < n; i++)
            if (n % i == 0){
                t = false;
                break;
            }

        if (t)
            System.out.println("tub");
        else
            System.out.println("not tub");

    }
}
