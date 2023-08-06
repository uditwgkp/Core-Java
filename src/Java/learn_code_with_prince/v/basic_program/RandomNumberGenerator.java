package Java.learn_code_with_prince.v.basic_program;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        System.out.println(Math.random() * (200-39+1) +39);

        Random random = new Random();
        System.out.println(random.nextInt(200));

        System.out.println(ThreadLocalRandom.current().nextInt(20,39));
    }
}
