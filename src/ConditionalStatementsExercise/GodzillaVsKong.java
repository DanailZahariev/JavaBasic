import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double priceOneCloth = Double.parseDouble(scanner.nextLine());
        double decorMoney = budget*0.10;
        double sumClothes=people*priceOneCloth;

        if (people>150){
            sumClothes=sumClothes*0.90;
        }
        double totalSumMovie=decorMoney+sumClothes;
        double diffrence = Math.abs(budget-totalSumMovie);
        if(totalSumMovie>budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",diffrence);
        }else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",diffrence);
        }
    }
}
