package Java.learn_code_with_prince.xxix.strictfp_keyword;

public strictfp class Strictfp_Demo {
    int data = 100;
    strictfp void change(int data){
        this.data = data+100;
    }
    public static void main(String[] args) {
        Strictfp_Demo st = new Strictfp_Demo();
        st.change(400);
        System.out.println("changing by adding 100 : " + st.data);
    }
//    strictfp Strictfp_Demo(){};
}
