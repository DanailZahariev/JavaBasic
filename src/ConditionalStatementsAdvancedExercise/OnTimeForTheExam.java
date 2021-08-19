import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivedHour = Integer.parseInt(scanner.nextLine());
        int arrivedMinutes = Integer.parseInt(scanner.nextLine());
        int allMinutesExam = (examHour * 60) + examMinutes;
        int allMinutesArrival = (arrivedHour * 60) + arrivedMinutes;
        int diff = allMinutesArrival - allMinutesExam;
        if (diff > 0) {
            System.out.println("Late");
            int hour = diff / 60;
            int minutes = diff % 60;
            if (hour < 1) {
                System.out.printf("%d minutes after the start", minutes);
            } else {
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }
        } else if (diff >= -30) {
            System.out.println("On time");
            if (diff != 0) {
                System.out.printf("%d minutes before the start", Math.abs(diff));
            }
        } else {
            System.out.println("Early");
            diff = Math.abs(diff);
            int hour = diff / 60;
            int minutes = diff % 60;
            if (hour < 1) {
                System.out.printf("%d minutes before the start", minutes);
            } else {
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            }
        }
    }
}
