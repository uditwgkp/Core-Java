package Java.code_with_Deepak;

import java.util.Scanner;

public class Prime_no_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int numb = sc.nextInt();
        int temp=0;
        for(int i=2; i<=(numb/2); i++){
            if(numb%i==0){
                temp =temp+1;
            }
        }
        if(temp==0) {
            System.out.println(numb + " is a Prime Number");
        }else {
            System.out.println(numb + " is not a Prime Number ");
        }
    }
}
