import java.util.Scanner;

public class Vacantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.next());
        double avaiableMoney = Double.parseDouble(scanner.next());
        double finalSum = avaiableMoney;
        boolean isFailed = false;
        int countDays = 0;
        int spendingCount = 0;
        while (finalSum < neededMoney) {
            if(spendingCount==5){
                isFailed = true;
                break;
            }
            String action = scanner.next();
            double value = Double.parseDouble(scanner.next());
            countDays++;
            if (action.equals("save")) {
                finalSum += value;
                spendingCount = 0;
            } else {
                spendingCount++;
                if (finalSum - value < 0) {
                    finalSum = 0;
                } else {
                    finalSum -= value;
                }
            }
        }
        if(isFailed){
            System.out.println("You can't save the money.");
            System.out.println(countDays);
        }else{
            System.out.printf("You saved the money for %d days.", countDays);
        }
    }
}
