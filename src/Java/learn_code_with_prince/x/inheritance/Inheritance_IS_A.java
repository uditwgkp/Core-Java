package Java.learn_code_with_prince.x.inheritance;

public class Inheritance_IS_A {
    //inheritance is a property when one class known as child acquire all the properties and behaviour from another
    //class known as parent, the idea behind this is you can create a classes built upon existing classes and add
    //more functionality to it.

    //used for method overriding(so runtime polymorphism is achieved), and for code reusability
    public static void main(String[] args) {

        //creating obj of child class
        Child ch= new Child();
        System.out.println(ch.p_name); //printing the name of parent through child reference
        System.out.println(ch.c_name); //printing the name of child
    }
}
class Parent{
    String p_name ="Parents";

}
//it's a single level inheritance A<--B
class Child extends Parent{
    String c_name= "child";
}
//it's a multilevel inheritance A<--B<--C
class GrandChild extends Child{

}
//it's a hierarchical level inheritance B-->A<--C
class AnotherChild extends Parent{

}

//to avoid amibiguity the multiple hybrid inheritance is not supported in java as the compiler will get it confused
//which method to call if two parent will have same method name