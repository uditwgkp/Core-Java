package Java.learn_code_with_prince.iv.control_statement.decision_making;

import Java.learn_code_with_prince.iv.control_statement.decision_making.GenerateVoterId;

public class IfElseSatement {
    public static void main(String[] args) {
        int age=10;

        if(age >= 18){
            System.out.println("You are eligibe to vote");
            GenerateVoterId abc = new GenerateVoterId();// control get to new class
            abc.printVoterID();
        }else {
            System.out.println("Sorry, abhi bacche ho....");
        }
        System.out.println("Thank you");
    }
}
