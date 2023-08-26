package Java.learn_code_with_prince.xxvii.wrapper_class;

public class Wrapper_Demo {
    public static void main(String[] args) {

        int a = 3;
        Integer a1 = Integer.valueOf(a);//converting int into Integer explicitly
        Integer a2 = a; //autoboxing, java compiler will automatically add Integer.valueOf() internally

        //Wrapper class
        Integer in = 30;
        Boolean bo = true;
        Character ch = 'a';
        Byte by = 2;
        Short sh = 23;
        Long lo = 234L;
        Float fl = 23.0f;
        Double dou = 343.99;

    }
}
