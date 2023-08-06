package Java.geek_for_geek;

public class G3_String_in_Java {
    public static void main(String[] args) {
        String str = "Geeks";
        System.out.println(str);
        String str1 = new String("Geeks.for.Geek");
        System.out.println(str1);
        String internedString = str1.intern();// this will add the string to string constant pool.
        System.out.println(internedString);
    }
}
