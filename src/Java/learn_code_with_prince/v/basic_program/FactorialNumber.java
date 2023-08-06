package Java.learn_code_with_prince.v.basic_program;

public class FactorialNumber {
    public static void main(String[] args) {
        int num=4;
        int fact=1;
        for (int i =num; i>0; i--){
            fact = fact* i;
        }
        System.out.println("Factorial of " + num + " is : " +  fact);

        int z=5;
        System.out.println("Factorial of " + z + " is : " +FactorialRecursiveApproach.factorial(z));
    }
}
class FactorialRecursiveApproach{
    static int factorial(int n){
        if(n==0){
            return 1;
        }else {
            return (n * factorial(n-1));
        }
    }
}
