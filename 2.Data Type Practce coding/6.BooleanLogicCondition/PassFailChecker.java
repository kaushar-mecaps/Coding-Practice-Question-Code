public class PassFailChecker {
    public static void main(String[] args) {
        int marks = 33;
        // int marks = 32;
        boolean isExamGiven = true;

        if (marks >= 33 && isExamGiven == true) {
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
    }
}
