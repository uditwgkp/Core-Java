package Java.learn_code_with_prince.xxxv.exception_handling;

public class NestedTryBlock {
    // a try inside another try block is known as nested try block
    //When any try block does not have a catch block for a particular exception,
    //then the catch block of the outer (parent) try block are checked for that exception,
    //and if it matches, the catch block of outer try block is executed.
    public static void main(String[] args) {
        //outer try block
        try {
            //inner try block 1
            try {
                System.out.println("going to divide by 0");
                int b = 39 / 0;
            }
            //catch block of inner try block 1
            catch (ArithmeticException e) {
                System.out.println(e);
            }


            //inner try block 2
            try {
                int a[] = new int[5];

                //assigning the value out of array bounds
                a[5] = 4;
            }

            //catch block of inner try block 2
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }


            System.out.println("other statement");
        }
        //catch block of outer try block
        catch (Exception e) {
            System.out.println("handled the exception (outer catch)");
        }

        System.out.println("normal flow..");
    }

}
