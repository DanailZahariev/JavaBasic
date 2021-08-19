import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceKgVegetable = Double.parseDouble(scanner.nextLine());
        double priceKgFruits = Double.parseDouble(scanner.nextLine());
        int totalKgVegetable = Integer.parseInt(scanner.nextLine());
        int totalKgFruits = Integer.parseInt(scanner.nextLine());
        double totaSumLv = (priceKgVegetable*totalKgVegetable)+(priceKgFruits*totalKgFruits);
        double totalSum = (totaSumLv/1.94);

        System.out.printf("%.2f",totalSum);


    }
}

