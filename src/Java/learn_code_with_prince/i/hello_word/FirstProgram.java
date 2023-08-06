package Java.learn_code_with_prince.i.hello_word;

//public is a access modifier, class is keyword, FirstProgram is className
public class FirstProgram {

    //static is keyword, void is return type, main is method name, string args is a command line argument
    //its a main method JVM always search for main method to start its execution
    public static void main(String[] args) {

        //this is used to print statement
        //System is a class, out is an object of the PrintStream class, println() is a method of PrintStream class
        System.out.println("Hello Prince....");

    }
}

//this program will compile and a .class file will be created with class name, which is also called bytecode
//which is platform independent any machine which have jdk install in it can run this .class file.