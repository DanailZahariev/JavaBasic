import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nonWorkingDays = Integer.parseInt(scanner.nextLine());
        int plaingWorkingDays = (365 - nonWorkingDays) * 63;
        int plaingNonWorkingDays = nonWorkingDays * 127;
        int fullPlayingMinutes = plaingNonWorkingDays + plaingWorkingDays;
        int diff = Math.abs(30000 - fullPlayingMinutes);
        int diffHours = diff / 60;
        int diffMinutes = diff % 60;
        if (fullPlayingMinutes > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", diffHours, diffMinutes);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", diffHours, diffMinutes);
        }
    }
}