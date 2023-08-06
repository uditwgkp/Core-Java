package Java.learn_code_with_prince.v.basic_program;

public class FibonacciSeries {
    public static void main(String[] args) {

        int count =10;
        int firstNumber = 0;
        int secondNumber = 1;
        int tracker =2;
        System.out.print(firstNumber );
        do {
            System.out.print( " " + secondNumber);
            tracker++;
            int local = firstNumber;
            firstNumber = secondNumber;
            secondNumber  = local + secondNumber;
        }while (tracker <= count);
    }
}
