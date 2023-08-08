package Java.learn_code_with_prince.xvi.final_keyword;

public class Final_Demo {
    // final keyword is used to restrict the user
    // final is used with variable, method and class

    // a final variable value is cannot be changed after initialization
    final int z=23;

    //a final variable not initialized can be initialized in constructor only
    final int a;

    //Similarly a final static variable uninitialized can be initialized in static block only.
    public Final_Demo(int a) {
        this.a = a;
    }

}
class Parent{
    //cannot be overridden in child class as parent method is final
    final void message(){
        System.out.println("Hello from final parent");
    }
}
final class Child extends Parent{

//    void message(){} --> cannot override it as it will give error at compile time as parent class method is final
}
//cannot extend now child class as Child class is final so this will give error--> class GrandChild extends Child{}