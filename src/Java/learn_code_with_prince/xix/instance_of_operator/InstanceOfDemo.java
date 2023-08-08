package Java.learn_code_with_prince.xix.instance_of_operator;

public class InstanceOfDemo {
    // it is used to test whether the object is an instance of the specified type
    // it return either true or false
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e instanceof Employee);
    }
    //just checking whether it working outside main or not or inside class or not
    Employee e = new Employee();
    boolean b= e instanceof Employee;
}
class Employee{

}


