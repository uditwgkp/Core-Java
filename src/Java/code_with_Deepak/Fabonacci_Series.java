package Java.code_with_Deepak;

public class Fabonacci_Series {
    public static void main(String[] args) {
        int n= 10;
        int a=0;
        int b=1;
        int c;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i=1;i<n;i++){
            c=a+b;
            System.out.print(c +" ");
            a=b;
            b=c;

        }
    }
}
