package Java;


public class Test {
    public static void main(String args[])throws Exception{
        String str = "hi reecha how are you.";
        String toggle = "";
        String[] words= str.split("\\s");
        for (String w:words) {
            String first = w.substring(0,1);
            String after = w.substring(1);
            toggle += first.toLowerCase()+after.toUpperCase() +" ";
        }
        System.out.println(toggle.trim());
    }
}


