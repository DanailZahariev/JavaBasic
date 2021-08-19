import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.next());
        String tarrif = scanner.next();
        if (km < 20 && tarrif.equals("day")) {
            double taxiDayPrice = 0.79;
            double taxiDay = 0.70 + taxiDayPrice * km;
            System.out.printf("%.2f", taxiDay);
        } else if (km < 20 && tarrif.equals("night")) {
            double taxiNightPrice = 0.90;
            double taxiNight = 0.70 + km * taxiNightPrice;
            System.out.printf("%.2f", taxiNight);
        } else if (km >= 20 && km < 100) {
            double bus = 0.09 * km;
            System.out.printf("%.2f", bus);
        } else if (km >= 100) {
            double train = 0.06 * km;
            System.out.printf("%.2f", train);
        }
    }
}