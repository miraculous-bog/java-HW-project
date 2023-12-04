package CW3;

import java.util.Scanner;

public class t2_3 {
    
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = userInput.next().charAt(0);

        System.out.println("Binary representation: " + convertCharToBinary(inputChar));

        userInput.close();
    }

    public static String convertCharToBinary(char character) {

        StringBuilder binaryString = new StringBuilder();

        for (int i = 15; i >= 0; i--) {
            boolean bitValue = ((character >> i) & 1) == 1;
            binaryString.append(bitValue ? '1' : '0');
        }

        return binaryString.toString();
    }
}
