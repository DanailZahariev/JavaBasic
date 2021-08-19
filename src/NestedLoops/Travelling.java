import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while (!input.equals("End")) {
            String destination = input;
            double price = Double.parseDouble(scanner.next());
            while (price > 0) {
                double savingMoney = Double.parseDouble(scanner.next());
                price -= savingMoney;
                if (price <= 0) {
                    System.out.printf("Going to %s!%n", destination);
                    break;
                }
            }
            input = scanner.next();
        }
    }
}
