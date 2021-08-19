import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricePerPage = Double.parseDouble(scanner.nextLine());
        double pricePerCover = Double.parseDouble(scanner.nextLine());
        int discountPaper = Integer.parseInt(scanner.nextLine());
        double sumToPay = Double.parseDouble(scanner.nextLine());
        int percentAllSum = Integer.parseInt(scanner.nextLine());
        double startPrice = pricePerPage * 899 + pricePerCover * 2;
        double discount = startPrice - startPrice * discountPaper / 100;
        double designerPay = discount + sumToPay;
        double totalSum = designerPay - designerPay * percentAllSum / 100;
        System.out.printf("Avtonom should pay %.2f BGN.", totalSum);

    }
}
