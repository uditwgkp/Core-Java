import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter number 1: " ); 
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: " );
        int num2 = scanner.nextInt();
        printSum(num1, num2);

        System.out.println("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt();
        printFactorial(num);
    }
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    public static void printFactorial(int num){
        if (num<0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return; 
            
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}
