import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceTennisRocket = Double.parseDouble(scanner.nextLine());
        int totalTennisRockets = Integer.parseInt(scanner.nextLine());
        int sneakers = Integer.parseInt(scanner.nextLine());
        double totalPriceRockets = priceTennisRocket * totalTennisRockets;
        double singlePriceSneakers = priceTennisRocket / 6;
        double totalSneakerPrice = sneakers * singlePriceSneakers;
        double totalEquipment = 0.2 * (totalPriceRockets + totalSneakerPrice);
        double totalPrice = totalPriceRockets + totalSneakerPrice + totalEquipment;
        double djokovichPrice = totalPrice / 8;
        double sponsorsPrice = totalPrice * 7 / 8;
        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(djokovichPrice));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(sponsorsPrice));
    }
}
