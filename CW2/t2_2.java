package CW2;

import java.util.Scanner;

public class t2_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number:");
		int num1 = scanner.nextInt();

		System.out.println("Enter the second number:");
		int num2 = scanner.nextInt();

		int max = (num1 > num2) ? num1 : num2;

		System.out.println("The maximum is: " + max);

		scanner.close();
	}
}
