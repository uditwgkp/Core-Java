package Java.code_with_Deepak;

public class Swap_Two_Number {
    public static void main(String[] args) {

        usingThirdVariable(45,57);
        NotusingThirdVariable(78,23);
    }
    public static void usingThirdVariable(int a,int b){
        int c;
        System.out.println("Before Swapping a: " + a + " b: " + b );
        c=a;
        a=b;
        b=c;
        System.out.println("After Swapping a: " + a + " b: " + b );
    }
    public static void NotusingThirdVariable(int a,int b){
        System.out.println("Before Swapping a: " + a + " b: " + b );
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping a: " + a + " b: " + b );

    }
}
