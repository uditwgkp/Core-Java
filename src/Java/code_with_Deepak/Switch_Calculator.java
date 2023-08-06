package Java.code_with_Deepak;

import java.util.Scanner;

public class Switch_Calculator {
    public static void main(String[] args) {

        String yn;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.printf("Enter No 1 : ");
            int n1 = sc.nextInt();

            System.out.printf("Enter No 2 : ");
            int n2 = sc.nextInt();

            System.out.printf("Select Symbol : { + , - , * , / } :- ");
            String symb = sc.next();

            int res;
            switch (symb) {
                case "+":
                    res = n1 + n2;
                    System.out.println("Sum of the two no is : " + res);
                    break;
                case "-":
                    res = n1 - n2;
                    System.out.println("Difference of the two no is : " + res);
                    break;
                case "*":
                    res = n1 * n2;
                    System.out.println("Multiplication of the two no is : " + res);
                    break;
                case "/":
                    res = n1 / n2;
                    System.out.println("Division of the two no is : " + res);
                    break;
                default:
                    System.out.println("Invalid Symbol....");
            }
            System.out.printf("Want to try another operation : press 'Y' or 'N' : ");
            yn = sc.next();
            if(yn.equalsIgnoreCase("n")){
                System.out.println("Thank You.....Have a nice Day...");
            }
        }while (yn.equalsIgnoreCase("y"));
    }
}
