package Java.learn_code_with_prince.xxvi.math_class;

public class Demo {
    public static void main(String[] args) {

        double x = 28;
        double y = 4;

        System.out.println("X --> " + x + " y --> " + y );

        //return the maximum between two no;
        System.out.println("Maximum between x and y is : " + Math.max(x,y));

        //return the square root
        System.out.println("Square root of y is : " + Math.sqrt(y));

        //return the power of the number
        System.out.println("y power 2 is : " + Math.pow(y,2));

        //returns the logarithm of the given value when base is 10
        System.out.println("Log10 of x is : " + Math.log(x));

        //return the log of x+1
        System.out.println("Log1p of x is: " + Math.log1p(x));

        //return a power of 2--> returns euler's number e raised to the power of a double value
        //if the argument is NaN then the result is NaN
        //if the argument is +ve infinity, then the result is positive infinity
        //if the argument is -ve infinity, then the result is positive zero
        System.out.println("exp of y is " + Math.exp(y));

        //return (a power of 2)-1
        System.out.println("expm1 of y is " +Math.expm1(y));
    }
}
