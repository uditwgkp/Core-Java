package Java.code_with_Deepak;

public class Leap_Year_Check{
    public static void main(String[] args) {

        leapCheck1(1204);
        leapCheck2(1206);
    }
    public static void leapCheck1(int a){
        if(a%4 == 0) {
            if (a % 100 == 0) {
                if(a%400 == 0){
                    System.out.println("Leap Year");
                }
                else {
                    System.out.println("Not Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("Not a leap year");
        }
    }
    public static void leapCheck2(int a){
        if ((a%400 == 0) || (a%4==0 && a%100 !=0)){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a Leap Year");
        }
    }
}
