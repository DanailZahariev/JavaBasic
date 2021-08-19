import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int priceHall= Integer.parseInt(scanner.nextLine());
        double priceCake = priceHall*0.20;
        double beverage = priceCake-(priceCake*0.45);
        double animator = priceHall/3.0;
        double sum = priceHall + priceCake + beverage + animator;

        System.out.println(sum);

    }
}
