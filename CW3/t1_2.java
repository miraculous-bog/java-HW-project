package CW3;

import java.util.Scanner;

public class t1_2 {
    public static void main(String[] args) {

        String firstString, secondString;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        firstString = userInput.next();

        System.out.print("Enter the second string: ");
        secondString = userInput.next();

        if (firstString.equals(secondString)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        userInput.close();
    }
}
