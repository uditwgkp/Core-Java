package Java.code_with_Deepak;

public class Palindrome_Number_Check {
    public static void main(String[] args) {
        int num=525171525;
        int copy_num=num;
        int check=0;
        while(copy_num>0){
            check=check*10+copy_num%10;
            copy_num = copy_num/10;
        }
        if(num==check){
            System.out.println("Palindrome_Number");
        }else
            System.out.println("Not Palindrome_Number");
    }
}
