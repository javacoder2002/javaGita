package recur;

public class Recur1 {
    public static void main(String[] args) {

        System.out.println(fact(5));

    }

    static long fact(int i){
        if (i == 1)
            return 1;
        return i * fact(i - 1);
    }

}
