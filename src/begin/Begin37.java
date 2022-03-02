package begin;

import java.util.Scanner;

public class Begin37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speedOfFirstCar = scanner.nextDouble();
        double speedOfSecondCar = scanner.nextDouble();
        double distanceBetweenCars = scanner.nextDouble();
        double time = scanner.nextDouble();

        double distanceBetweenCarsAfterTime = distanceBetweenCars - (speedOfFirstCar + speedOfSecondCar) * time;

        System.out.println("distance between cars after time = " + distanceBetweenCarsAfterTime);
    }
}
