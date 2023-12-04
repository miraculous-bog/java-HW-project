package CW4;

import java.util.Random;

public class t3_2 {
    public static void main(String[] args) {

        int[] randomNumbers = new int[25];
        Random randomGenerator = new Random();

        System.out.println("Generated Numbers:");
        for (int i = 0; i < 25; i++) {
            randomNumbers[i] = randomGenerator.nextInt(200) - 100;
            System.out.print(randomNumbers[i] + ", ");
        }

        System.out.println("\nComparison Table:");

        String tabSpace = "";
        for (int i = 0; i < 25; i++) {
            System.out.printf("%s|", tabSpace);
            for (int j = i; j < 25; j++) {
                if (randomNumbers[i] > randomNumbers[j]) {
                    System.out.printf("%3d>%3d|", randomNumbers[i], randomNumbers[j]);
                } else if (randomNumbers[i] < randomNumbers[j]) {
                    System.out.printf("%3d<%3d|", randomNumbers[i], randomNumbers[j]);
                } else {
                    System.out.printf("%3d=%3d|", randomNumbers[i], randomNumbers[j]);
                }
            }
            System.out.println();
            tabSpace += "        ";
        }
    }
}
