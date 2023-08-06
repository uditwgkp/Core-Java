package Java.code_with_Deepak;

public class Factorial_Using_Recursion {
    static int fact=1;
    public static void main(String[] args) {
        int no = 5;
        calfact(no);
        System.out.println(fact);
    }
    static void calfact(int no){
        fact = fact * no;
        if(no>1) {
            calfact(no - 1);
        }
    }
}
