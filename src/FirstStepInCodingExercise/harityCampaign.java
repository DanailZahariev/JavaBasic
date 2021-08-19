import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int bakers = Integer.parseInt(scanner.nextLine());
        int cakeNumbers = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());
        double sumCakes = cakeNumbers * 45.0;
        double sumWaffles = waffles * 5.80;
        double sumPancakes = pancakes * 3.20;
        double allDaysBakers = (sumCakes + sumWaffles + sumPancakes) * bakers;
        double sumCampaign = allDaysBakers * days;
        double sumAfterCost = sumCampaign - ( sumCampaign/8);

        System.out.printf("%.2f",sumAfterCost);
    }
}

