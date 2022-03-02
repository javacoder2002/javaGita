package recur;

public class Recur4 {
    static int count = 0;

    static int[] massive = new int[8];

    public static void main(String[] args) {

        System.out.println(fib1(8));

        System.out.println(count);

    }

    static long fib1(int n){
        count++;
        if (n < 3)
            return 1;
        return fib1(n - 2) + fib1(n - 1);
    }

    // 1, 1, 2, 3, 5, 8, 13, 21

}
