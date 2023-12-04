package HW4;

import java.util.Random;

public class t4_9 {
    private static final double[] PROBABILITIES = {1/8.0, 1/8.0, 1/8.0, 1/8.0, 1/8.0, 3/8.0};
    private Random random;

    public t4_9() {
        random = new Random();
    }

    public int roll() {
        double randValue = random.nextDouble();
        double cumulativeProbability = 0;

        for (int i = 0; i < PROBABILITIES.length; i++) {
            cumulativeProbability += PROBABILITIES[i];

            if (randValue < cumulativeProbability) {
                return i + 1; 
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        t4_9 loadedDie = new t4_9();

        int result = loadedDie.roll();
        System.out.println("Результат кидка: " + result);
    }
}
