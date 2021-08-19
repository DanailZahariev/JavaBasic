import java.util.Scanner;

public class YardGreeing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double allYard = Double.parseDouble(scanner.nextLine());
        double needMoney = 7.61*allYard;
        double discount = needMoney-0.18*needMoney;
        double totalSum = needMoney-discount;
        System.out.println("The final price is:"+ (discount));
        System.out.printf("The discount is:%f",totalSum);

        
    }
}


