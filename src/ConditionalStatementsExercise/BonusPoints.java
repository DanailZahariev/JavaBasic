import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        double bonus = 0;
        if (num <= 100){
            bonus = 5;
        } else if (num <= 1000){
            bonus = num * 0.2;
        } else {
            bonus = num * 0.10;
        }

        if (num % 2 == 0){
            bonus = bonus + 1;
        }
        if (num % 10 == 5){
            bonus = bonus + 2;
        }

        System.out.printf("%.1f%n", bonus);
        System.out.printf("%.1f%n", num + bonus);
    }
}