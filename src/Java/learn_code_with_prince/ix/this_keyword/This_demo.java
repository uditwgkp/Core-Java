package Java.learn_code_with_prince.ix.this_keyword;

public class This_demo {
    // this: there can be lot of usage of this in java. In java this is a reference variable that referes to current class object.


    //this can be used to refer current class instance variables.
    int id;
    int rollNo;
    This_demo(int id,int rollNo){
        id = id;
        rollNo=rollNo; //causes ambiguity here come use of this we can write it as this.id = id; this.rollNo=rollNo;
    }

    //to invoke current class method if we don't use java compiler add it automatically.
    void m(){
        //....
    }
    void n(){
        m();  // java compiler will automatically add this.m();
    }

    //to invoke current class constructor, in other word it is used for constructor chaining
    //it should also be first statement in constructor.
    This_demo(){
        System.out.println("Default Constructor");
    }
    This_demo(int id){
        this(); //calling default constructor from parameterized constructor
        System.out.println(id);
    }

    //to pass as an argument in method, mainly used in event handling
    void m(This_demo obj){

    }


}
