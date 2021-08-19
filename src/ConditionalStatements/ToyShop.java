import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double quantityPuzzles=Double.parseDouble(scanner.nextLine());
        double quantityTalkingDolls=Double.parseDouble(scanner.nextLine());
        double quantityTeddyBear=Double.parseDouble(scanner.nextLine());
        double quantityMinions=Double.parseDouble(scanner.nextLine());
        double quantityTrucks=Double.parseDouble(scanner.nextLine());
        double toysSum=(quantityPuzzles*2.60)+(quantityTalkingDolls*3)+(quantityTeddyBear*4.10)+(quantityMinions*8.20)+(quantityTrucks*2);
        double quantityToys=quantityPuzzles+quantityTalkingDolls+quantityTeddyBear+quantityMinions+quantityTrucks;
        if(quantityToys>=50){
            toysSum=toysSum-(toysSum*0.25);
        }
        toysSum=toysSum-(toysSum*0.10);
        double diff=Math.abs(vacationPrice-toysSum);
        if (toysSum>=vacationPrice){
            System.out.printf("Yes! %.2f lv left.",diff);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.",diff);
        }

    }
}
