package HW3;

import java.util.Scanner;

public class t2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введіть операцію (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Помилка: ділення на нуль.");
                    return;
                }
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Помилка: невідома операція.");
                return;
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }
}