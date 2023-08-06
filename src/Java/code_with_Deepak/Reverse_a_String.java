package Java.code_with_Deepak;

public class Reverse_a_String {
    public static void main(String[] args) {
        String str = "Radheshyam";
        String rev_str = "";
        for(int i = str.length()-1; i>=0; i--){
            rev_str = rev_str +str.charAt(i);
        }
        System.out.println(rev_str);

    }
}
