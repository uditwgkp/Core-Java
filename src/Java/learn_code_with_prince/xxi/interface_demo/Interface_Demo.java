package Java.learn_code_with_prince.xxi.interface_demo;

public class Interface_Demo implements Printable{
    // an interface in java is a blueprint of class. It has static constants and abstract methods.
    // interface in java is a mechanism to achieve abstraction. There can only be abstract method in interface(100% abstraction)
    // through interface we can achieve multiple inheritance and also achieve loose coupling
    // interface cannot be instantiated like abstract class. we need to implement interface
    // an interface extends another interface.
    public static void main(String[] args) {

        new Interface_Demo().print();
    }

    @Override
    public void print() {
        System.out.println( Printable.MIN);
    }
}
interface Printable{
    int MIN=5;    //java compiler-->public static final int MIN=5;
    void print(); //java compiler-->public abstract void print();

    //Java 8--> interface can have default and static methods also
    default void about(){
        System.out.println("used for printing min value");
    }
    static void min_value(){
        System.out.println("MIN value is: " + MIN);
    }

    //Java9--> we can have private method also
    private void check(){
        System.out.println("Just checking private method in interfaced");
    }


}
