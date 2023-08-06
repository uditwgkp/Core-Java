package Java.code_with_Deepak;

public class Largest_of_Two_Three_No {
    public static void main(String[] args) {
        largest_of_Three_No1(5,10,15);
        largest_of_Two_No(7,78);
        largest_of_Three_No2(50,100,150);
    }
    public static void largest_of_Two_No(int a,int b){
        if(a>b){
            System.out.println(a + " is greater");
        }else{
            System.out.println(b + " is greater");
        }
    }
    public static void largest_of_Three_No1(int a,int b,int c){
        if(a>b && a>c){
            System.out.println(a + " is greater");
        }
        else if(b>a && b>c){
            System.out.println(b + " is greater");
        }else {
            System.out.println(c + " is grater");
        }
    }
    public static void largest_of_Three_No2(int a,int b,int c){
        if(a>b){
            if(a>c){
                System.out.println(a + " is greater");
            }
            else
            {
                System.out.println(c + " is greater");
            }
        }else if(b>c){
            System.out.println(b + " is greater");
        }
        else {
            System.out.println(c + " is greater");
        }
    }
}
