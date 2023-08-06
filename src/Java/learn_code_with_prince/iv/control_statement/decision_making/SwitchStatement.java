package Java.learn_code_with_prince.iv.control_statement.decision_making;

public class SwitchStatement {
    public static void main(String[] args) {
        int marks=30;
        switch (marks){
            case (80):{
                System.out.println("Excellent Performance");
                break;
            }
            case (60):{
                System.out.println("you are doing good can do better");
                break;
            }
            case (40):{
                System.out.println("Need to work hard");
                break;
            }
            default:{
                System.out.println("You are fail.... Very Bad");
            }
        }
    }
}
