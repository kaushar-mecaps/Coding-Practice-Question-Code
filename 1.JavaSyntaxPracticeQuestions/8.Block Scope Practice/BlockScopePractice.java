public class BlockScopePractice {
    public static void main(String[] args) {

        // Outer Variable
        String outerVariable = "This Is Outer Variable";

        // Inner variable 
        {
            String innerVariable = "This Is Inner Variable";
            System.out.println(innerVariable);
            // System.out.println(outerVariable);
        }
        
        System.out.println(outerVariable);
        // System.out.println(innerVariable);  // This is wrong because inner variable not access to outer block
        
        
    }
}
