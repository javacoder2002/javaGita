package begin;

import java.util.Scanner;
/**
 * speed, of, ship, time, by, river, opposite, distance
 * */
public class Begin35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speedOfShip = scanner.nextDouble();
        double speedOfRiver = scanner.nextDouble();

        double timeByRiver = scanner.nextDouble();
        double timeOppositeRiver = scanner.nextDouble();

        double distanceByRiver = timeByRiver * (speedOfShip + speedOfRiver);
        double distanceOppositeRiver = timeOppositeRiver * (speedOfShip - speedOfRiver);

        double distanceOfShip = distanceByRiver + distanceOppositeRiver;

        System.out.println("distance of ship = " + distanceOfShip);
    }
}
