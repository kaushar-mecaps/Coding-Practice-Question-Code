// User se Input lena hai aur Syntax samjhana hai .

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // User Input lene ke liye Scanner class ka object
        Scanner scr = new Scanner(System.in);

        // Name Input 
        System.out.print("Enter your Name = ");
        String name = scr.nextLine();
       
        // Age Input 
        System.out.print("Enter your Age = ");
        int age = scr.nextInt();

        // Output
        System.out.println("Your Name = " + name);
        System.out.println("Your Age = " + age);

        scr.close();

    }
}
