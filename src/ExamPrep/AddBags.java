import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceForBag = Double.parseDouble(scanner.nextLine());
        double bagsKg = Double.parseDouble(scanner.nextLine());
        int daysTillTravel = Integer.parseInt(scanner.nextLine());
        int countBag = Integer.parseInt(scanner.nextLine());
        double priceForBags = 0;
        double totalPrice = 0;
        double sum = 0;
        if (bagsKg < 10) {
            priceForBags = priceForBag * 0.20;
        } else if (bagsKg >= 10 && bagsKg <= 20) {
            priceForBags = priceForBag * 0.50;
        } else if (bagsKg > 20) {
            priceForBags = priceForBag;
        }
        if (daysTillTravel > 30) {
            totalPrice = priceForBags * 1.10;
        } else if (daysTillTravel >= 7 && daysTillTravel <= 30) {
            totalPrice = priceForBags * 1.15;
        } else if (daysTillTravel < 7) {
            totalPrice = priceForBags * 1.40;
        }
        sum = totalPrice * countBag;
        System.out.printf("The total price of bags is: %.2f lv.", sum);
    }
}