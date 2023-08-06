package Java.learn_code_with_prince.xiii.covariant_return_type;

public class Covariant_Demo {

    //it is possible to override any method by changing their return type from java 5
    //it help in getting rid of class cast exception and also from confusing type cast
    public static void main(String[] args) {
        new Child().get().message();
    }
}
class Parent{
    Parent get(){
        return this;
    }
}
class Child extends Parent{
    //since Child is subclass of parent so we can change return type of child
    @Override
    Child get(){
        return this;
    }
    void message(){
        System.out.println("Welcome to covariant return type...");
    }
}
