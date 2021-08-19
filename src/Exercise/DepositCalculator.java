import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double prc = Double.parseDouble(scanner.nextLine());
        double increase = deposit* (prc/100);
        double increaseMonth =  increase/12;
        double sum = deposit+(months*increaseMonth);
        System.out.println(sum);

    }
}
