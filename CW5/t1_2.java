package CW5;

import java.util.Scanner;

public class t1_2 {
    public static void main(String args[]) {
        int[] numberArray = new int[10000];
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter integer numbers. End with 0: ");
        int num = 1;
        int index = 0;

        while (num != 0) {
            numberArray[index] = userInput.nextInt();
            num = numberArray[index];
            index++;
        }

        userInput.close();
        findMin(numberArray);
        findMax(numberArray);
    }

    static void findMin(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        System.out.println("Min is: " + min);
    }

    static void findMax(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("Max is: " + max);
    }
}
