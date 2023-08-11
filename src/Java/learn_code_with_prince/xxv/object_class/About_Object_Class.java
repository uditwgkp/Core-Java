package Java.learn_code_with_prince.xxv.object_class;

public class About_Object_Class {
    // Object class is parent class of all classes in java by default.
    // It is beneficial if we want to refer any object whose type we don't knew
    //Object class have many methods. you can go inside object class or in documentation to know more.
    //Popular method are: toString(), hashCode(), clone(), notify(), notifyAll(), getClass(), wait(), finalize(), etc.
    Object obj = new Object();

    public static void main(String[] args) {
        try{
            B b= new B();
//            B b2= (B) b.clone(); //since B class doesn't implement cloneable interface so it cannot be cloned.
            A a1= new A(10);
            A a2 = (A) a1.clone();
            System.out.println(a1.a_id);
            System.out.println(a2.a_id);
        }
        catch(Exception e){

        }

    }


}
class A implements Cloneable{
    int a_id;

     A(int id){
        this.a_id= id;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class B{
    int b_id;
}
