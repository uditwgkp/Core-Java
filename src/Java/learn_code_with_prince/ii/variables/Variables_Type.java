package Java.learn_code_with_prince.ii.variables;

public class Variables_Type {

    //static variables--> this is object dependent all object created with this class will have same copy of it
    //                    if one object change its value all will have the updated value
    static int maxuimumMarks = 100;

    //instance variables--> every class will have its own copy, one changes will not affect other.
    String studentName;
    int gainedMarks;


    //here name inside method is local variable and percentage is also local variable.
    void printPercentage(String name, int obtainedMarks){
        float percentage = (obtainedMarks * 100)/maxuimumMarks;
        System.out.println(name + " got " + percentage + "%" );
    }
}

class Main{
    public static void main(String[] args) {
        Variables_Type obj1 = new Variables_Type();
        obj1.studentName = "Akshay";
        obj1.gainedMarks = 99;
        obj1.printPercentage(obj1.studentName, obj1.gainedMarks);

        Variables_Type obj2 = new Variables_Type();
        obj2.studentName = "Akarshit";
        obj2.gainedMarks = 67;
        obj2.printPercentage(obj2.studentName, obj2.gainedMarks);

        System.out.println("obj1 Total Marks : " + obj1.maxuimumMarks + " gainedMarks : " + obj1.gainedMarks);
        System.out.println("obj2 Total Marks : " + obj2.maxuimumMarks + " gainedMarks : " + obj2.gainedMarks);
    }
}
