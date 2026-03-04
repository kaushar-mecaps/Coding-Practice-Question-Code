public class MethodWithParameters {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition(50, 50);
    }
}

class Calculator {
    public void addition(int a, int b) {
        int add = a + b;
        System.out.println("Sum = " + add);

    }
}
