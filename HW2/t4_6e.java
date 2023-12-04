package HW2;

import java.util.Scanner;

public class t4_6e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();

        double sigmoidResult = calculateSigmoid(x);
        double sigmoidDerivativeResult = calculateSigmoidDerivative(x);

        System.out.println("Sigmoid result: " + sigmoidResult);
        System.out.println("Sigmoid Derivative result: " + sigmoidDerivativeResult);

        scanner.close();
    }

    public static double calculateSigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }

    public static double calculateSigmoidDerivative(double x) {
        double sigmoidX = calculateSigmoid(x);
        return sigmoidX * (1 - sigmoidX);
    }
}

