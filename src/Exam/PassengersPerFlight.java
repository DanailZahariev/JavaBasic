import java.util.Scanner;

public class PassengersPerFlight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allAirlines = Integer.parseInt(scanner.nextLine());
        String input = "";
        String airlineName = "";
        String maxAirline = "";
        int max = 0;
        for (int i = 0; i < allAirlines; i++) {
            airlineName = scanner.nextLine();
            int passengers = 0;
            int average = 0;
            int count = 0;
            input = scanner.nextLine();
            while (!input.equals("Finish")) {
                passengers += Integer.parseInt(input);
                count++;
                input = scanner.nextLine();
            }
            if ("Finish".equals(input)) {
                average = passengers / count;
                if (average > max) {
                    max = average;
                    maxAirline = airlineName;
                }
                System.out.println(airlineName + ": " + average + " passengers.");
            }
        }
        System.out.println(maxAirline + " has most passengers per flight: " + max);
    }
}
