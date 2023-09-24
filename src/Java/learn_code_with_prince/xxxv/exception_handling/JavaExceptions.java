package Java.learn_code_with_prince.xxxv.exception_handling;

public class JavaExceptions {
    //exception handling is one of powerful mechanism to handle runtime errors so that normal flow can be maintained

    //There are mainly twp types of exception: Checked and Unchecked Exception(error comes under unchecked exception)

    //Checked Exception: directly inherit Throwable class except RuntimeException and Error
    //                   checked at compile time only

    //UnChecked Exception: inherit the runtime exception
    //                     not checked at compile time, checked at runtime

    //Error: it is irrecoverable

    //The JVM firstly checks whether the exception is handled or not.
    //If exception is not handled, JVM provides a default exception handler that performs the following tasks:
    //-->Prints out exception description.
    //-->Prints the stack trace (Hierarchy of methods where the exception occurred).
    //-->Causes the program to terminate.
    //But if the application programmer handles the exception, the normal flow of the application is maintained.
    public static void main(String[] args) {

        //handling an exception using try catch block
        try {
            System.out.println("Inside try block");
            int data = 100/0;
            System.out.println("This will not execute as the exception occurred at above line");
        }catch (ArithmeticException ae){
            System.out.println("Catch Exception : " + ae);
            System.out.println("Rest of Code");
        }

    }

}
