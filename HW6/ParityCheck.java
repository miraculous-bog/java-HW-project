package HW6;
import java.util.Scanner;

public class ParityCheck {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть розмір логічної матриці (N): ");
            int n = scanner.nextInt();

            int[][] matrix = new int[n][n];
            System.out.println("Ввведіть елементи булевої матриці");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            String result = isParityProperty(matrix);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println("Неправильні дані. Введіть дійсні цілі числа для розміру матриці.");
        }
    }

    private static String isParityProperty(int[][] matrix) {
        int n = matrix.length;
        int[] rowParity = new int[n];
        int[] colParity = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowParity[i] += matrix[i][j];
                colParity[j] += matrix[i][j];
            }
            rowParity[i] %= 2;
        }

        for (int j = 0; j < n; j++) {
            colParity[j] %= 2;
        }

        int rowErrorCount = 0;
        int colErrorCount = 0;
        int rowErrorIndex = -1;
        int colErrorIndex = -1;

        for (int i = 0; i < n; i++) {
            if (rowParity[i] == 1) {
                rowErrorCount++;
                rowErrorIndex = i;
            }

            if (colParity[i] == 1) {
                colErrorCount++;
                colErrorIndex = i;
            }
        }

        if (rowErrorCount == 1 && colErrorCount == 1) {
            return String.format("Матриця має властивість парності. Пошкоджений біт у позиції (%d, %d).",
                    rowErrorIndex + 1, colErrorIndex + 1);
        } else if (rowErrorCount == 0 && colErrorCount == 0) {
            return "Матриця маэ властивість парності";
        } else {
            return "Матриця пошкоджена (потрібно перевернути більше ніж один біт для властивості парності).";
        }
    }
}
