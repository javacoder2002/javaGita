package begin;

import java.util.Scanner;

public class Begin33 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double price = scanner.nextDouble();

        double y = scanner.nextDouble();

        //1 kg
        double priceOfOneKilogramCandy = weight / price;

        //y kg
        double priceOfYKilogramCandy = priceOfOneKilogramCandy * y;

    }
}
