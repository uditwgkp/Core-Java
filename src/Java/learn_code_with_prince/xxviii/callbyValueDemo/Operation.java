package Java.learn_code_with_prince.xxviii.callbyValueDemo;

public class Operation {
    int data = 50;
    void change(int data){
        data = data+100; // if we change it to this.data = data+100; then we  will get changes reflected
    }

    public static void main(String[] args) {
        Operation op = new Operation();
        System.out.println("before change op.data value : " + op.data);
        op.change(300);
        System.out.println("after change op.data value : " + op.data);
    }
}
