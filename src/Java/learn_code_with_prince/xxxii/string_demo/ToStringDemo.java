package Java.learn_code_with_prince.xxxii.string_demo;

public interface ToStringDemo {
    // to represent any object as a string, toString() method comes into existence
    // it returns the String representation of the object
    public static void main(String[] args) {
        Student st = new Student(1,"Udit");
        System.out.println(st);//without toString it will print hashcode value of the object
    }
}
class Student{
    int id;
    String name;

    Student(int id, String name){
        this.id= id;
        this.name= name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

