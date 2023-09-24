package Java.learn_code_with_prince.xxxii.string_demo.string_class_method;

public class StringMethodDemo {
    public static void main(String[] args) {
        //Java String class provides a lot of inbuilt methods that are used to manipulate the string
        String str = "Hello Udit how are you.";
        String a_str = "Hello I am fine...";

        //charAt()-->throws StringIndexOutOfBoundException if index is greater
        System.out.println(str.charAt(6));

        //compareTo()--> compares on the basis of unicode value of each character im string
        //           --> returns positive, negative, and 0.
        //           --> throws two exception--ClassCastException and NullPointerException
        System.out.println(str.compareTo(a_str));

        //concat() --> it appends the specified string at the end of this string and return it.
        System.out.println(a_str.concat("appending this"));

        //contains()--> if specified string found returns the true and false if not
        //          --> it should not be used to search character in a string, doing so will lead to error
        System.out.println("string contains Udit : " + str.contains("Udit"));

        //endsWith() --> it check the whether the string ends with given suffix
        System.out.println("does string end with you : " + a_str.endsWith("you"));

        //equals() --> it compares the two given string based on the content of string. if any character is not present
        //             it return false else true.
        //         --> it overrides the equals() method of Object class.
        //equalsIgnoreCase() --> it check the content of string irrespective of the case(lower or upper)
        String firstString = "Krishna Pratrap";
        String secondString = "Krishna Pratap";
        System.out.println(firstString.equals(secondString));

        //format() --> returns the formatted string by given locale, format and arguments
        //         --> if locale is not defined it, call the default locale Locale.getDefault().
        //         --> it throws NullPointerException and IllegalFormatException
        String str1 = String.format("%d", 101);
        String str2 = String.format("|%10d|", 101);  // Specifying length of integer
        String str3 = String.format("|%-10d|", 101); // Left-justifying within the specified width
        String str4 = String.format("|% d|", 101);
        String str5 = String.format("|%010d|", 101); // Filling with zeroes
        String str6 = String.format("%x", 101);          // Hexadecimal value
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);

        //valueOf() --> converts different types of values into string.
        char ch1 = 'A';
        char ch2 = 'B';
        String s1 = String.valueOf(ch1);
        String s2 = String.valueOf(ch2);
        System.out.println(s1);
        System.out.println(s2);

        //Java String Methods
        //String getBytes()
        //String getChars()
        //String indexOf()
        //String intern()
        //String isEmpty()
        //String join()
        //String lastIndexOf()
        //String length()
        //String replace()
        //String replaceAll()
        //String split()
        //String startsWith()
        //String substring()
        //String toCharArray()
        //String toLowerCase()
        //String toUpperCase()
        //String trim()



    }
}
