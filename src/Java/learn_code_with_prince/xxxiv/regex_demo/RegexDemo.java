package Java.learn_code_with_prince.xxxiv.regex_demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    //it is an api to define a pattern for searching and manipulating the strings.
    //widely used in password and email validation.
    //java.util.regex provide 1 interface and 3 classes
    //the Matcher and Pattern provide the facility of java regular expression

    //the Matcher class implements the MatchResult interface.
    //it is a regex engine which is used to perform match operations on character sequence.

    //it is compiled version of a regular expression. It is used to define a pattern for the regex engine

    public static void main(String[] args) {
        //1st way
        Pattern p = Pattern.compile(".s"); //represents single character
        Matcher m = p.matcher("as");
        boolean b = m.matches();

        //2nd way
        boolean b2 = Pattern.compile(".s").matcher("ant").matches();

        //3rd way
        boolean b3 = Pattern.matches(".s","as");

        System.out.println(b + " " + b2 + " " + b3);

        //The . (dot) represents a single character
        System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)
        System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)

        //Regex Character classes
        //Regex Quantifiers
        //Regex Metacharacters

    }
}
