public class AverageFind {
    public static void main(String[] args) {
        // Store 5 subject marks int the int data type.
        int maths = 85;
        int hindi = 90;
        int english = 95;
        int biology = 75;
        int physics = 70;

        int total = maths + hindi + english + biology + physics;

        double average = total/5;

        double present = (total*100)/500;

        System.out.println("Total Marks = " +total);
        System.out.println("Average = " + average);
        System.out.println("Persent = " +present+"%");
    }
}
