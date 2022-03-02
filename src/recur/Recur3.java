package recur;

public class Recur3 {
    public static void main(String[] args) {

        System.out.println("powerN(3, -1) = " + powerN(3, -1));

    }

    static double powerN(double x, int n) {
        if (n < 0)
            return Math.pow(x, n);
        else {
            if (n == 1)
                return x;
            if (n % 2 == 0)
                return powerN(x, n / 2) * powerN(x, n / 2);
            else
                return x * powerN(x, n - 1);
        }
    }

}
