package Java.learn_code_with_prince.xxxi.command_line_arguments;

public class Command_Line_Argument_Demo {
    //Command line argument is a argument that is passed at the time of running the java program
    //The argument passed from console can be received in the java program, and it can be used as an input.
    //so it provides a convenient way to check the behaviour of program for different values.

    public static void main(String[] args) {
        System.out.println("First Command Line argument is : " + args[0]);
        //run this by passing argument else it will throw indexOutOfBoundException
        // java Command_Line_Argument_Demo
        // we can also pass multiple argument
    }
}
