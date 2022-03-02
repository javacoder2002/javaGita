package begin;

import java.util.Random;
import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args) {

        final double pi = Math.PI;

        Scanner scanner = new Scanner(System.in);
        double r1 = scanner.nextDouble();
        double r2 = scanner.nextDouble();

        double s1 = pi * Math.pow(r1, 2);
        double s2 = pi * Math.pow(r2, 2);

        double ds = s1 - s2;

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("ds = " + ds);

    }

//    public static void method1(){
//        System.out.println("result -_ x _-");
//
//        Random random = new Random();
//
//        long countTrue = 0;
//        long countFalse = 0;
//
//        for (int i = 0; i < 2_000_000_000; i++)
//            if (random.nextBoolean())
//                countTrue++;
//            else
//                countFalse++;
//
//        System.out.println("countTrue = " + countTrue);
//        System.out.println("countFalse = " + countFalse);
//    }

}
