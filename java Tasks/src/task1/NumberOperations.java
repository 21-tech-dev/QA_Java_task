import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число (a): ");
            int a = readInt(scanner);
            
            System.out.print("Введите второе число (b): ");
            int b = readInt(scanner);

            compareNumbers(a, b);
            performOperations(a, b);
        }
    }

    private static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введите целое число!");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void compareNumbers(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    private static void performOperations(int a, int b) {
        System.out.println("Сумма: " + ((long) a + b));
        System.out.println("Разность: " + ((long) a - b));
        System.out.println("Произведение: " + ((long) a * b));
        
        if (b != 0) {
            System.out.println("Деление: " + ((double) a / b));
        } else {
            System.out.println("Деление на ноль невозможно");
        }
    }
}