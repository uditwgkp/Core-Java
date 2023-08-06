package Java.code_with_Deepak;

import java.util.Scanner;

public class Factorial_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to find its factorial : ");
        int n = sc.nextInt();
        int temp = 1;
        for(int i=n;i>0;i--){
            temp = temp * i;
        }
        System.out.println("Factorial of "+n+" is :"+ temp);
    }
}
