package Java.learn_code_with_prince.vi.object_and_classes;

public class AnonymousObject {
    public static void main(String[] args) {

        //the class having no reference is known as anonymous class.
        new Employeee().printId(3);
    }
}
class Employeee{
    void printId(int id){
        System.out.println("The id of employee is: " + id);
    }
}