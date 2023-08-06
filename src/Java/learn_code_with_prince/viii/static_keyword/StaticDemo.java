package Java.learn_code_with_prince.viii.static_keyword;

public class StaticDemo {
    //the keyword static is used for memory management
    //the static can be applied with variable, method, block and nested class

    //static variables: this are independent of object instances and are created at time of
    //                  class loading and shared among all instances of that class
    static int a=10;

    //static method: these method belong to class rather than object so no need to create instance of object to call it.
    //               can access static data member and change its value.
    //               cannot call non-static data member and methods directly. this and super cannot be used in static context.
    static void changeValue(){
        a = 50;
    }

    //static block: used to initialize static data member and is executed before main method at the time of classloading.
    static{
        int a =60;
    }

    //static nested class
    static class Class_Demo{
        int b=40;
    }
}
