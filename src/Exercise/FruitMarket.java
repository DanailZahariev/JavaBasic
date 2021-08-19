import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananaKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double raspberryKg = Double.parseDouble(scanner.nextLine());
        double strawberryKg = Double.parseDouble(scanner.nextLine());
        //Цена на малините за килограм: 24 лв.
        //Цена на портокалите за килограм: 24 – (0.4 * 24) = 14.4 лв.
        //Цена на бананите за килограм: 24 – (0.8 * 24) = 4.8 лв.
        //Сума за малините: 6.5 * 24 = 156 лв.
        //Сума за портокалите: 3.3 * 14.4 = 47.52 лв.
        //Сума за бананите: 4.8* 10 = 48 лв.
        //Сума за ягодите: 1.7* 48 = 81.6 лв.
        //Обща сума: 156 + 47.52 + 48 + 81.6 = 333.12 лв.
        double priceRaspberry = strawberryPrice*0.50;
        double priceOrange = priceRaspberry - (priceRaspberry*0.40);
        double priceBanana = priceRaspberry - (priceRaspberry*0.80);
        double sumRaspberry = raspberryKg * priceRaspberry;
        double sumOrange = orangeKg*priceOrange;
        double sumBanana = bananaKg*priceBanana;
        double sumStrawberry = strawberryKg*strawberryPrice;
        double totalSum = sumRaspberry + sumOrange+ sumBanana+sumStrawberry;

        System.out.printf("%.2f",totalSum);




    }
}
