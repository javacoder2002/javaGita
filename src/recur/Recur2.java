package recur;

public class Recur2 {
    public static void main(String[] args) {

        System.out.println(fact2(6));

    }

    static long fact2(int i){
        if (i == 2 || i == 1)
            return i;
        return i * fact2(i - 2);
    }



}
