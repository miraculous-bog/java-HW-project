package CW5;

import java.util.Scanner;

public class t1_4 {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number of values: ");
        int n = userInput.nextInt();
        System.out.println("Enter values separated by space: ");
        int valuesArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            valuesArray[i] = userInput.nextInt();
        }

        userInput.close();

        int maxNum = valuesArray[0];
        int currentNum = valuesArray[0];
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < valuesArray.length; i++) {
            if (valuesArray[i] == currentNum) {
                count++;
            } else {
                currentNum = valuesArray[i];
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                maxNum = currentNum;
            } else if (count == maxCount && currentNum > maxNum) {
                maxNum = currentNum;
            }
        }

        System.out.printf("%d times in a row, the value \"%d\" has been revealed.\n", maxCount, maxNum);
    }
}