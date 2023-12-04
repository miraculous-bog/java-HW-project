package CW4;

public class t3_4 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Недостатньо аргументів. Введіть три цілі числа.");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if ((a == b) && (a == c)) {
            System.out.println("1 - Всі числа рівні");
        } else if ((a == b) ^ (a == c) ^ (b == c)) {
            System.out.println("2 - Два числа рівні");
        } else {
            System.out.println("3 - Жодні два числа не рівні");
        }
    }
}
