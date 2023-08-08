package Java.learn_code_with_prince.xv.instance_intializer_block;

import java.util.Random;

public class InstanceInitializerDemo {
    //it is used to initialize instance data member. It run each time when object of class is created.
//    The instance initializer block is created when instance of the class is created.
//    The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
//    The instance initializer block comes in the order in which they appear.
    public static void main(String[] args) {
        System.out.println( new InstanceInitializerDemo().id);
    }
    int id;
    {
        Random random = new Random();
        id = 100* random.nextInt(23);
    }
}
