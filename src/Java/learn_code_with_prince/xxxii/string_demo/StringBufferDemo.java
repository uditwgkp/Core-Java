package Java.learn_code_with_prince.xxxii.string_demo;

public class StringBufferDemo {
    public static void main(String[] args) {
        //it is used to create mutable (modifiable) String objects.
        //String Buffer class is thread-safe. i.e. multiple threads cannot access simultaneously.

        StringBuffer sb = new StringBuffer("Hello Udit ");

        System.out.println(sb);

        sb.append("How are you..");
        System.out.println(sb);


    }
}
