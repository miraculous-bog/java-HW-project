package CW4;

import java.util.Random;

public class t3_6 {
    public static void main(String[] args) {
        int numSimulations = 1000000;
        int aliceWins = simulateCoinGame(numSimulations);
        double probability = (double) aliceWins / numSimulations;

        System.out.println("Alice wins with probability: " + probability);
    }

    public static int simulateCoinGame(int numSimulations) {
        Random randomGenerator = new Random();
        int aliceWins = 0;

        for (int i = 0; i < numSimulations; i++) {
            boolean aliceCondition1 = false;
            boolean aliceCondition2 = false;
            boolean bobCondition1 = false;

            while (true) {
                boolean coinDrop = randomGenerator.nextBoolean();

                if (coinDrop && aliceCondition1) {
                    aliceCondition2 = true;
                } else if (coinDrop && !aliceCondition1) {
                    aliceCondition1 = true;
                } else {
                    aliceCondition1 = false;
                    aliceCondition2 = false;
                }

                coinDrop = randomGenerator.nextBoolean();

                if (!coinDrop && bobCondition1) {
                    break;
                } else if (coinDrop && bobCondition1) {
                    bobCondition1 = false;
                } else if (coinDrop && !bobCondition1) {
                    bobCondition1 = true;
                }

                if (aliceCondition2) {
                    aliceWins++;
                    break;
                }
            }
        }

        return aliceWins;
    }
}
