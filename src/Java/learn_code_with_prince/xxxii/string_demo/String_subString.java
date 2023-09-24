package Java.learn_code_with_prince.xxxii.string_demo;

import java.io.IOException;

public class String_subString {
    // a part of String is called sub String
    // String class provide built in subString method
    public static void main(String[] args) throws IOException {
        String s1 = "Hi I am a java, a programming language";

        String s2 = s1.substring(4);
        String s3 = s1.substring(3,10);
        System.out.println(s2);
        System.out.println(s3);

        String[] s4 = s1.split(" ");
        System.out.println(s4[3]);
    }
}
