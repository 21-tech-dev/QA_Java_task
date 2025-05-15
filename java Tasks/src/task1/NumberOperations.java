import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = readInt(scanner, "Введите первое число (a): ");
        int b = readInt(scanner, "Введите второе число (b): ");

        compare(a, b);
        printResults(a, b);

        scanner.close();
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число.");
            }
        }
    }

    private static void compare(int a, int b) {
        if (a == b) {
            System.out.println("Числа равны");
        } else {
            System.out.printf("Число %d %s числа %d%n", a, a > b ? "больше" : "меньше", b);
        }
    }

    private static void printResults(int a, int b) {
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Произведение: " + (a * b));

        if (b != 0) {
            System.out.println("Деление: " + ((double) a / b));
        } else {
            System.out.println("Делить на ноль нельзя.");
        }
    }
}
