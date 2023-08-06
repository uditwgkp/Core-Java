package Java.code_with_Deepak;

import java.util.Scanner;

public class Taking_User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
