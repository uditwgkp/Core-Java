package Java.learn_code_with_prince.xxx.javadoc_tool;

public class JavaDoc_Demo {
    /** This is a sample documentation for the above class */
    public static void main(String[] args) {

        JavaDoc_Demo jd = new JavaDoc_Demo();
        System.out.println( "10 cube is " + jd.cube(10));

    }

    /**this method takes
     * @param a of integer type
     * @return cube of the number
     */
    int cube(int a){
        return a*a*a;
    }
}
