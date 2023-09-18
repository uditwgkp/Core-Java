package Java.learn_code_with_prince.xxxii.string_demo;

public class String_Concatenation {
    // In java String concatenation forms a new String is the combination of multiple String
    // There are two ways to concatenate: by using +  and by using concat() method
    public static void main(String[] args) {

        String s1 = "Sachin" + "Tendulkar";
        // Internally Java Compiler String s1 = (new StringBuilder()).append("Sachin").append("Tendulkar").toString();

        String s2 = "Sachin";
        String s3 = "Tendulkar";
        String s4 = s1.concat(s2);
    }
}
