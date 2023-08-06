package Java.code_with_Deepak;

public class Armstrong_Number_Check {
    public static void main(String[] args) {
        int numb = 153;
        int n_copy1 = numb,n_copy2=numb;
        int finalValue = 0;
        
        int noOfDigit = 0;
        while (n_copy1 > 0) {
            n_copy1 = n_copy1 / 10;
            noOfDigit = noOfDigit + 1;
        }
        System.out.println("length of digit : " + noOfDigit);
        
        int rem;
        while (n_copy2>0){
            rem=n_copy2%10;
            n_copy2=n_copy2 / 10;
            int mul=1;
            for(int i = 1; i<=noOfDigit; i++){
                mul = mul * rem;
            }
            finalValue= finalValue+ mul;
        }
        
        if(finalValue==numb) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not a Armstrong Number");
        }
    }
}
