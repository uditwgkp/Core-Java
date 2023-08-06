package Java.code_with_Deepak;

public class Reverse_a_Number {
    public static void main(String[] args) {
        int n = 5478789;
        int temp=0;
        int rev=0;
        while (n != 0){
            temp=n%10;
            rev=(rev*10)+temp;
            n=n/10;
        }
        System.out.println("Reversed Number is : " + rev);
    }
}
