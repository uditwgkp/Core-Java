package Java.learn_code_with_prince.iv.control_statement.loop;

public class DoWhile {
    public static void main(String[] args) {
        int i=15;
        do {

            System.out.println("Hello");
//            i=i+10;  //--> executes infinitely
            i--;
        }while (i>10);
    }
}
