package CW2;

import java.util.Scanner;

public class t2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first pair:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Enter the second pair:");
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int sum1 = num1 + num2;
        int sum2 = num3 + num4;

        int largerSum = (sum1 > sum2) ? sum1 : sum2;

        System.out.println("The larger sum is: " + largerSum);

        scanner.close();
    }
}
