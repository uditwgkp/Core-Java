package Java.learn_code_with_prince.iii.datatype;

public class Non_Primitive {
    public static void main(String[] args) {
        //here b is of type Bank which is a non-primitive datatype similarly array classes interface are all non-primitive data type.
        Bank b = new Bank();
        b.createAccNO(10000);
        int[] arr= new int[10];
    }
}
class Bank{
    public int accNo;
    void createAccNO(int accNo){
        this.accNo=accNo;
    }
}