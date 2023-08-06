package Java.learn_code_with_prince.v.basic_program;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 999;
        int temp= num;
        int last=0;
        int sum=0;
        int power=0;

        while (temp != 0){
            temp = temp/10;
            power++;
        }
        System.out.println(power);

        temp=num;
        while (temp > 0){
            last = temp%10;
            sum +=  (Math.pow(last, power));
            temp = temp/10;
        }

        if (num == sum){
            System.out.println("Armstrong Number");
        }else System.out.println("Not Armstrong Number.");
    }
}
