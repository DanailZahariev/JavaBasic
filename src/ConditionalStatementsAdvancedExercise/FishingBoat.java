import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());
        double shipRent = 0;
        switch (season) {
            case "Spring":
                shipRent = 3000;
                break;
            case "Summer":
            case "Autumn":
                shipRent = 4200;
                break;
            case "Winter":
                shipRent = 2600;
                break;
        }
        if (fisherman <= 6) {
            shipRent = shipRent * 0.90;
        } else if (fisherman >= 7 && fisherman <= 11) {
            shipRent = shipRent * 0.85;
        } else {
            shipRent = shipRent * 0.75;
        }
        if (fisherman % 2 == 0 && !season.equals("Autumn")) {
            shipRent = shipRent * 0.95;
        }
        double total = Math.abs(budget - shipRent);
        if (shipRent > budget) {
            System.out.printf("Not enough money! You need %.2f leva.", total);
        } else {
            System.out.printf("Yes! You have %.2f leva left.", total);

        }
    }
}
