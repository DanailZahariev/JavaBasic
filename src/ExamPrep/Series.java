import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int coutSeries = Integer.parseInt(scanner.nextLine());

        for (int series = 1; series <= coutSeries; series++) {
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());
            switch (name) {
                case "Thrones":
                    price = price - 0.50 * price;
                    break;
                case "Lucifer":
                    price = price - 0.40 * price;
                    break;
                case "Protector":
                    price = price - 0.30 * price;
                    break;
                case "TotalDrama":
                    price = price - 0.20 * price;
                    break;
                case "Area":
                    price = price - 0.10 * price;
                    break;
            }
            budget -= price;
        }
        if (budget >= 0) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget));
        }
    }
}
