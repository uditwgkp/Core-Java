package Java.learn_code_with_prince.xxxii.string_demo;

public class String_Comparison {
    public static void main(String[] args) {


        String s1 = "Udit";
        String s2 = "udit";
        String s4 = "udit";
        String s3 = "Udits";
        // We can compare String on basis of content and reference
        /**
         * 1. By using equals() method: compares the original content of String
         *                              returns true and false
         *                              used for authentication
         *    there are two method: equals(Object another), equalsIgnoreCase(String another)
         */
        if (s1.equals(s2)) {
            System.out.println("s1 is same as s2");
        }
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("s1 is not fully same as s2 ");
        }

        /**
         * 2.By using == operator: compares reference not values.
         *                       reference matching
         */
        if(s2 == s4){
            System.out.println("s1 and s2 are pointing to the same object");
        }

        /**
         * 3.By using compareTo() method: compares the value lexicographically and returns the integer values, that describes
         *                                whether the String is less than, equals to or greater than another string
         *                                s1 = s2 returns 0
         *                                s1 > s2 returns positive value
         *                                s1 < s2 returns negative value
         *                              used for sorting basically
         */
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));

        //we can also concat string using String Builder class append() method
        //using format() method
        //using join() method
        //using StringJoiner class
        //using Collector.joining() method
    }
}
