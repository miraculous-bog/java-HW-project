package HW2;
import java.util.Scanner;

public class t3_26 {

    public static void main(String[] args) {
        // Створення об'єкта Scanner для зчитування введених даних
        Scanner scanner = new Scanner(System.in);

        // Запит користувача на введення радіуса та висоти циліндра
        System.out.print("Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();

        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();

        // Обчислення об'єму циліндра
        double volume = calculateCylinderVolume(radius, height);

        // Виведення результату
        System.out.println("Об'єм циліндра з радіусом " + radius + " та висотою " + height + " дорівнює: " + volume);

        // Закриття Scanner
        scanner.close();
    }

    // Метод для обчислення об'єму циліндра
    static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}