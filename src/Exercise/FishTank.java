import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenghtCm = Integer.parseInt(scanner.nextLine());
        int widthCm = Integer.parseInt(scanner.nextLine());
        int hightCm = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int volume = lenghtCm*widthCm*hightCm;
        double liters = volume * 0.001;
        double percentVolume = percent/100;
        double neededLiters = liters*(1-percentVolume);
        System.out.printf("%.2f",neededLiters);

    }
}
