package Java.learn_code_with_prince.iv.control_statement.decision_making;

public class IfStatement {
    public static void main(String[] args) {

        int age=18;

        if(age >= 18){
            System.out.println("You are eligibe to vote");
            GenerateVoterId abc = new GenerateVoterId();// control get to new class
            abc.printVoterID();
        }
        System.out.println("Thank you");

    }
}
