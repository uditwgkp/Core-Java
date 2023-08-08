package Java.learn_code_with_prince.xiv.super_keyword;

public class Super_Demo {

    //it is used as reference variable to refer immediate parents class object.
    public static void main(String[] args) {

        Child c = new Child();
        c.p_message();
    }
}
class Parent{
    int id=100;

    void p_message(){
        System.out.println("Hello from Parent method");
    }

    Parent(){
        System.out.println("Parent Default constructor");
    }
}
class Child extends Parent{
    int id =121;

    void p_message(){
        super.p_message();//it will call super message class
        System.out.println(id); //will print child id
        System.out.println(super.id); //will print parent id
    }

    Child(){
        super();//used to call parent class constructor
        System.out.println("Inside child class constructor");
    }
}
