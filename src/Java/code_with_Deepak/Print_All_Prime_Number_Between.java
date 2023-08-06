package Java.code_with_Deepak;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Print_All_Prime_Number_Between {
    public static void main(String[] args) {
        int n = 100;
        int temp = 0;
        List<Integer> primeNumb = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            for (int j = 2; j < i-1; j++) {
                if (i % j == 0) {
                    temp= temp+1;
                }
            }
            if(temp==0) {
                primeNumb.add(i);
            }else {
               temp =0;
            }
        }
        System.out.println("Prime Number between 1 to " + n + " is : " + primeNumb);
    }
}
