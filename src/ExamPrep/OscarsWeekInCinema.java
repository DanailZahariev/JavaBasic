import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        String cinemaType = scanner.nextLine();
        int ticketsCount = Integer.parseInt(scanner.nextLine());
        double priceTicket = 0;
        if (movieName.equals("A Star Is Born")) {
            switch (cinemaType) {
                case "luxury":
                    priceTicket = ticketsCount * 10.50;
                    break;
                case "ultra luxury":
                    priceTicket = ticketsCount * 13.50;
                    break;
                case "normal":
                    priceTicket = ticketsCount * 7.50;
                    break;
            }
        } else if (movieName.equals("Bohemian Rhapsody")) {
            switch (cinemaType) {
                case "luxury":
                    priceTicket = ticketsCount * 9.45;
                    break;
                case "ultra luxury":
                    priceTicket = ticketsCount * 12.75;
                    break;
                case "normal":
                    priceTicket = ticketsCount * 7.35;
                    break;
            }
        } else if (movieName.equals("Green Book")) {
            switch (cinemaType) {
                case "luxury":
                    priceTicket = ticketsCount * 10.25;
                    break;
                case "ultra luxury":
                    priceTicket = ticketsCount * 13.25;
                    break;
                case "normal":
                    priceTicket = ticketsCount * 8.15;
                    break;
            }
        } else if (movieName.equals("The Favourite")) {
            switch (cinemaType) {
                case "luxury":
                    priceTicket = ticketsCount * 11.55;
                    break;
                case "ultra luxury":
                    priceTicket = ticketsCount * 13.95;
                    break;
                case "normal":
                    priceTicket = ticketsCount * 8.75;
                    break;
            }
        }
        System.out.printf("%s -> %.2f lv.", movieName, priceTicket);
    }
}
