
public class NarrowingCasting {
    public static void main(String[] args) {
        // Normal Local Variable.
        double dou = 45.45;
        long l = 751345L;

        // Narrowing casting.
        int i = (int) dou;
        byte b = (byte) l;

        System.out.println("Before Type casting of double = "+dou);
        System.out.println("After Type Casting of double to int = " +i);

        System.out.println("Before Type Casting of long = " +l);
        System.out.println("After Type Casting of long to byte = " +b);

    }
}
