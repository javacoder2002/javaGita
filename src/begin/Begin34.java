package begin;

import java.util.Scanner;

public class Begin34 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double weightChocolate = scanner.nextDouble();
        double priceChocolate = scanner.nextDouble();

        double weightCandy = scanner.nextDouble();
        double priceCandy = scanner.nextDouble();

        double priceOfOneKilogramChocolate = weightChocolate / priceChocolate;
        double priceOfOneKilogramCandy = weightCandy / priceCandy;

        double differenceBetweenCandyAndChocolate = priceOfOneKilogramChocolate - priceOfOneKilogramCandy;

        System.out.println("Chocolate is cost expensive from candy = " + differenceBetweenCandyAndChocolate);

    }
}
