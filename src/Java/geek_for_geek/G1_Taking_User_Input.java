package Java.geek_for_geek;

import java.util.Scanner;

public class G1_Taking_User_Input
{
    public static void main(String[] args) {
        // Declare the variables
        int num;

        // Input the integer
        System.out.println("Enter the integer: ");

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read the next integer from the screen
        num = sc.nextInt();

        // Display the integer
        System.out.println("Entered integer is: " + num);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Gender:");
        char gender = sc.next().charAt(0);

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        System.out.println("Enter Phone No.");
        long phoneNo = sc.nextLong();

        System.out.printf("%n You inputed Follwing Thing " +
                "%nName : " + name  +
                "%nGender : " + gender +
                " %nAge " + age +
                "%nContact No. " + phoneNo);
    }
}
