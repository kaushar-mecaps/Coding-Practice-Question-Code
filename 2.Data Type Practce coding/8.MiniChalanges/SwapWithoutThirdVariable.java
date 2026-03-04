public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        // Local Variable
        int a = 5;
        int b = 10;

         // print the before swapping variable
        System.out.println("Before Swapping a = " + a);
        System.out.println("Before Swapping b = " +b);

        // Swapping without use third variable 
        a = a + b;     // 15
        b = a - b;     // 5
        a = a - b;     // 10

        // After swapping variable 
        System.out.println("After Swapping a = " + a);
        System.out.println("After Swapping b = " + b);


    }
}
