package Java.learn_code_with_prince.xxxii.string_demo;

public class String_Demo {
    // java String is basically an object that represents sequence of char values.
    // an array of character works same as java string.

    public static void main(String[] args) {
    char[] ch = {'a','u','d','i','t'};
    String s_ch = new String(ch);
    // is same as
    String s = "audit";

        System.out.println("Character string: "+s_ch);
        System.out.println("String : " + s);
    }

    // String class implement following class
    //public final class String implements java.io.Serializable, Comparable<String>, CharSequence, Constable, ConstantDesc{}

    //String are immutable it means it cannot be changed
    // If we try to change the string a new instance is created
    // String object are stored in a special memory are known as String Constant Pool (SCP)
    // String class are final so that no one can override and change its functionality

    //There are two ways to create a String:
    //1.By String Literals: In this case each time JVM check whether the object is present in SCP(String Constant Pool)
    //                      first. If exists a reference to pooled instance is returned. If not a new String is created.

    String s = "Hi";  //check SCP first and then creates one object in SCP

    //2.By new Keyword: In this case JVM will create a new String in normal(non-pooled) heap memory, and the
    //                  literal "Programmer" will be placed in SCP. The variable s_new will refer to the object in heap memory
    String s_new = new String("Programmers"); //creates two object in SCP and heap memory
}
