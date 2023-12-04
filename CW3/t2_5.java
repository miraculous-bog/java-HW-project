package CW3;


import java.util.Scanner;

public class t2_5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = userInput.nextInt();

        System.out.print("Enter the bit position (m): ");
        int m = userInput.nextInt();

        userInput.close();

        int mask = 1 << m;
        int result = n ^ mask;

        System.out.println("New number after toggling bit: " + result);
    }
}
