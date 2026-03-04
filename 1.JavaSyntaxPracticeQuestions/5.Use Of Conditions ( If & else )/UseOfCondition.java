import java.util.Scanner;

public class UseOfCondition {
    public static void main(String[] args) {
        
        // User Input lene ke liye Scanner class ka object .
        Scanner scr = new Scanner(System.in);

        // Input name .
        System.out.print("Enter Your Name ?");
        String name = scr.nextLine();

        // Input Age.
        System.out.print("Enter Your Age ?");
        int age = scr.nextInt();

        if (age >= 18) {
            System.out.println(name + " Adult \n "  + " Age = " + age);  
        } else{
            System.out.println(name + " Minor " + " \n Age = " + age);
        }

    }
    
}
