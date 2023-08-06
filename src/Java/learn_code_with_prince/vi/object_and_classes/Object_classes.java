package Java.learn_code_with_prince.vi.object_and_classes;

//class is a blueprint from which object is created
public class Object_classes {

    //it has field
    int var1= 232;

    //it has method
    int getVar1(){
        return var1;
    }

    //it has constructor
    Object_classes(){}

    void Object_classes(int v){
        this.var1 = v;
    }

    //blocks
    static {
        int i=10;
    }

    //it also has nested class and interface

    class NestedClass{

    }
}
class Main{
    public static void main(String[] args) {

        //An object has state, behaviour and also identity(used internally by jvm)
        //It is also instance of class.
        Object_classes ob = new Object_classes();
        System.out.println(ob.getVar1());
    }
}
