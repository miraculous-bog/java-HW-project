package CW3;

import java.util.Scanner;

public class t2_4 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter n, m: ");
        
        int originalNumber = userInput.nextInt();
        int bitPosition = userInput.nextInt();
        userInput.close();

        int mask = 1 << bitPosition;
        int result = originalNumber ^ mask;

        System.out.println("New number after toggling bit: " + result);
    }
}
