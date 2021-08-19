import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int adults = 0;
        int kids = 0;
        while (!command.equals("Christmas")) {
            int years = Integer.parseInt(command);
            if (years > 16) {
                adults++;
            } else if (years <= 16) {
                kids++;
            }
            command = scanner.nextLine();

        }
        int sweatersSum = adults * 15;
        int toysSum = kids * 5;
        System.out.println("Number of adults: " + adults);
        System.out.println("Number of kids: " + kids);
        System.out.println("Money for toys: " + toysSum);
        System.out.println("Money for sweaters: " + sweatersSum);
    }
}