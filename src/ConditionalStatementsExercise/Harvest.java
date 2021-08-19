import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xSquareMeter = Integer.parseInt(scanner.nextLine());
        double ySquareMeter = Double.parseDouble(scanner.nextLine());
        int zNeededLiterWine = Integer.parseInt(scanner.nextLine());
        int countWorker = Integer.parseInt(scanner.nextLine());
        double totalGrape = xSquareMeter * ySquareMeter;
        double wine = (totalGrape * 0.4) / 2.5;
        double restWine = Math.abs(wine - zNeededLiterWine);
        double winePerPerson = restWine / countWorker;
        if (wine >= zNeededLiterWine) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.\n", Math.ceil(restWine), Math.ceil(winePerPerson));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(restWine));
        }

    }
}
//        if (km < 20 && tarrif.equals("day")) {
//            double taxiDayPrice = 0.79;
//            double taxiDay = 0.70 + taxiDayPrice * km;
//            System.out.printf("%.2f", taxiDay);
//        } else if (km < 20 && tarrif.equals("night")) {
//            double taxiNightPrice = 0.90;
//            double taxiNight = 0.70 + km * taxiNightPrice;
//            System.out.printf("%.2f", taxiNight);
//        } else if (km >= 20 && km < 100) {
//            double bus = 0.09 * km;
//            System.out.printf("%.2f", bus);
//        } else if (km >= 100) {
//            double train = 0.06 * km;
//            System.out.printf("%.2f", train);