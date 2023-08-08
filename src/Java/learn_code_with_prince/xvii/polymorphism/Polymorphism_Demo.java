package Java.learn_code_with_prince.xvii.polymorphism;

public class Polymorphism_Demo {
    // when single task is performed in different ways it is known as polymorphism.
    //In java there are two types of polymorphism--> Compile-time and Runtime
    //polymorphism is performed in java by method overloading and method overriding
    public static void main(String[] args) {
        Child c = new Child();
        c.run();

        Runtime_Demo rd= new Child();
        rd.run();
        Runtime_Demo runtime_demo = new Runtime_Demo();
        runtime_demo.run();
    }
}
class Runtime_Demo{
    void run(){
        System.out.println("Running");
    }
}
class Child extends Runtime_Demo{
    void run(){
        System.out.println("Running safely with 60km");
    }
}
