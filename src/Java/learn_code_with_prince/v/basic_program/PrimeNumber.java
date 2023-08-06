package Java.learn_code_with_prince.v.basic_program;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 121;
        int mid = num/2;
        boolean flag =false;
        if(num==0 || num==1){
            System.out.println("Not a prime number");
        }else {
            for (int i =2;i<=mid;i++){
                if(num%i==0){
                    System.out.println("Not a prime number");
                    flag =true;
                    break;
                }
            }
            if (flag==false){
                System.out.println("Prime Number");
            }
        }
    }
}
