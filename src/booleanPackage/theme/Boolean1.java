package booleanPackage.theme;

public class Boolean1 {
    public static void main(String[] args) {
        boolean A = true;
        boolean B = false;
        boolean C = true;
        boolean D = false;

        System.out.println(
                (A && B || C && D) && (A || B)
        );

    }
}
