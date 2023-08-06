package Java.code_with_Deepak;

public class Fabonacci_Series_using_Recursion {
    static int a=0,b=1,c;
    public static void main(String[] args) {
        System.out.print(a+ " " + b);
        Fabonacci_Series_using_Recursion fb = new Fabonacci_Series_using_Recursion();
        fb.fabonaci_series(15);
    }
    void fabonaci_series(int n){
        if(n>=1){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            fabonaci_series(n-1);
        }
    }
}
