package Java.learn_code_with_prince.vii.constructor;

public class Constructor_Demo {
    int id;
    //constructor are same like method but they do not have return type and the name should be same as of class name

//    two types  of constructor are there
    // 1. Default Constructor- it is provided by default by JVM if no parameterized constructor is present.
    Constructor_Demo(){
        System.out.println("Inside default constructor id value is : " + id);
    }

    //2. Parameterized Constructor- it is used to initialize the value to object at the time of object creation.
    Constructor_Demo(int id){
        this.id= id;
        System.out.println("Inside parameterized constructor id value is : " + id);
    }

    // ---we can also overload constructor to perform different task, they are differentiated by compiler on basis of parameter and return type.

    public static void main(String[] args) {
        Constructor_Demo cdef = new Constructor_Demo();

        Constructor_Demo cpar = new Constructor_Demo(32);
    }
}
