package Java.learn_code_with_prince.xi.method_overloading;

public class Method_Overloading_Demo {
    //if a class is multiple method having same name but different parameters, it is known as method overloading
    // it increases readability of program, we can overload a method by changing the no of arguments and data types
    //method overriding is also possible with type promotion if no matching is found
    public static void main(String[] args) {
        Method_Overloading_Demo m = new Method_Overloading_Demo();
        m.printId(32);
        m.printIdandName(32,"Ram");
    }
    void printId(int id){
        System.out.println(id);
    }
    void printIdandName(int id,String name){
        System.out.println(id + " " + name);
    }
}
