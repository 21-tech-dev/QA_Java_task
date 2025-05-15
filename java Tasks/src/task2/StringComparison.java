import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первую строку (a): ");
            String a = scanner.nextLine().trim();
            
            System.out.print("Введите вторую строку (b): ");
            String b = scanner.nextLine().trim();

            System.out.println(a.equals(b) ? "Строки идентичны" : "Строки неидентичны");
        }
    }
}