import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceSkumriaKg =Double.parseDouble(scanner.nextLine());
        double priceCacaKg=Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        double kgMidi=Double.parseDouble(scanner.nextLine());
        double pricePalamud =priceSkumriaKg+priceSkumriaKg*0.60;
        double sumPalamud =kgPalamud*pricePalamud;
        double priceSafrid=priceCacaKg+priceCacaKg*0.80;
        double sumSafrid=kgSafrid*priceSafrid;
        double sumMidi=kgMidi*7.50;
        double totalSum=sumPalamud+sumSafrid+sumMidi;
        System.out.printf("%.2f",totalSum);

    }
}
