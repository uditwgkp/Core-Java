package Java.learn_code_with_prince.xxxii.string_demo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //it is also used to create mutable(modifiable) string
        //String Builder is same as StringBuffer except that is non-synchronized.

        StringBuilder sb = new StringBuilder("Hi Udit");
        sb.reverse();
        System.out.println(sb);
    }
}
