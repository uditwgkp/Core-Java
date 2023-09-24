package Java.learn_code_with_prince.xxxv.exception_handling;

public class tryCatchDemo {
    //we put the suspected code in try block which may cause exception

    //catch block is used to handle exception by declaring type of exception within the parameter
    //The declared exception must be parent class exception(i.e. Exception) or generated exception type
    //The catch exception must be used after the try block only
    //  -->There can be multiple catch block with a single try block, Each catch block must contain a different exception handler.
    //  -->At a time only one exception occurs and at a time only one catch block is executed.
    //  -->All catch blocks must be ordered from most specific to most general, i.e. catch for ArithmeticException must come before catch for Exception.

    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
