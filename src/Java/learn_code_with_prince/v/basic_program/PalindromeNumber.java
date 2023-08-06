package Java.learn_code_with_prince.v.basic_program;

public class PalindromeNumber {
    public static void main(String[] args) {

        int num = 1233321;
        int temp = num;
        int rev=0;
        while (num != 0){
            rev = rev*10 +num%10;
            num = num/10;
        }
        System.out.println("rev num : " + rev);
        if (rev == temp){
            System.out.println("Palindrome No");
        }else {
            System.out.println("Not a palindrome no");
        }
    }
}
