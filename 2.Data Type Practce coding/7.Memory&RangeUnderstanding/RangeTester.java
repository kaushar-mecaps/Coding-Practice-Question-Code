public class RangeTester {
    public static void main(String[] args) {
        byte maxValue = 127;
        byte minValue = -128;

        System.out.println("Max Value = " +maxValue);
        System.out.println("Min Value = " +minValue);

        maxValue++;
        minValue--;

        System.out.println("---------------------------------------------");
        System.out.println("After Adding 1 to Max Value  = " + maxValue);
        System.out.println("After Subtraction 1 to Min Value = " + minValue);

        System.out.println("2 Add in max value = " + (maxValue+2));

    }
}
