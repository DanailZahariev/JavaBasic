import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageLilly = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int countToys = 0;
        int savedMoney = 0;
        for (int birthday = 1; birthday <= ageLilly; birthday++) {
            if (birthday % 2 == 1) {
                countToys++;
            } else {
                savedMoney += birthday * 5 - 1;
            }
        }
        int totalSavedSum = savedMoney + (countToys * toyPrice);
        if (totalSavedSum >= priceWashingMachine) {
            double leftMoney = totalSavedSum - priceWashingMachine;
            System.out.printf("Yes! %.2f", Math.abs(leftMoney));
        } else {
            double needMoney = priceWashingMachine - totalSavedSum;
            System.out.printf("No! %.2f", needMoney);
        }
    }
}
