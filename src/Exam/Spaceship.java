import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double widthSpaceship = Double.parseDouble(scanner.nextLine());
        double lengthSpaceship = Double.parseDouble(scanner.nextLine());
        double heightSpaceship = Double.parseDouble(scanner.nextLine());
        double averageHeight = Double.parseDouble(scanner.nextLine());
        double volume = widthSpaceship * lengthSpaceship * heightSpaceship;
        double volumeRoom = (averageHeight + 0.40) * 2 * 2;
        double totalSpace = Math.floor(volume / volumeRoom);
        if (totalSpace >= 3 && totalSpace <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", totalSpace);
        } else if (totalSpace < 3) {
            System.out.println("The spacecraft is too small.");
        } else {
            System.out.println("The spacecraft is too big.");
        }
    }
}
