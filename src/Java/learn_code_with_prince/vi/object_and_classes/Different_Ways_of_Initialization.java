package Java.learn_code_with_prince.vi.object_and_classes;

public class Different_Ways_of_Initialization {

    public static void main(String[] args) {

        //1. with reference variable
        Student st = new Student();
        st.studentName = "Udit";

        //2. with method
        Employee emp = new Employee();
        emp.insertRecord(111, "Sonal Sina");

        //3. with constructor
        School sc = new School("Alma Mater", 2007);
    }
}
class Student{
    String studentName;
}
class Employee{
    int empId;
    String empName;

    void insertRecord(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }
}
class School{
    String schoolName;
    int openingYear;

    School(String schoolName,int openingYear){
        this.schoolName = schoolName;
        this.openingYear = openingYear;
    }
}
