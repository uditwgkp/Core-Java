package Java.learn_code_with_prince.xx.abstract_class;

public class Abstract_Demo {
    //Abstraction is a process in which internal implementation is hidden and only it shows functionality to the user.

    //A class declared which is declared with abstract keyword is known as abstract class. It can have abstract and
    //non-abstract method also. It needs to be extended and its method need to be implemented.
    //It cannot be instantiated.
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.drawStatus();
        rectangle.getTotalShape();
        rectangle.print(rectangle);

    }

}
abstract class Shape{

    static int totalShape;
    void getTotalShape(){
        System.out.println("Total drawn shape: " + totalShape);
    }

    //abstract method: It do not have method body and a class having a abstract method must be declared abstract.
    abstract void drawStatus();

    //An abstract class can have constructor and static method also.
    Shape(){totalShape++;} //default constructor
    static void nameOfShape(){
        //static method body
    }

    //it can have final method also which force the subclass not to change the body of method also
    final void print(Shape s){
        System.out.println("Printing shape: " + s);
    }
}
//class extending abstract class
class Rectangle extends Shape{
    @Override
    void drawStatus(){
        System.out.println("Drawing rectangle");
    }
}