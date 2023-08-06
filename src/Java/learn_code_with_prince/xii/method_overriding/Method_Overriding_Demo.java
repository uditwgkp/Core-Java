package Java.learn_code_with_prince.xii.method_overriding;

public class Method_Overriding_Demo {
    //if a subclass is having same method as declared in parents class it is known as method overriding
    //it is used to provide a specific function to a method, it is also used for runtime polymorphism

    public static void main(String[] args) {
        new Parent().dump(23);
        new Child().dump(23);
    }
}
class Parent{
    void dump(int id){
        System.out.println(id);
    }
}
class Child{
    void dump(int id){
        id= id+10;
        System.out.println(id);
    }
}
