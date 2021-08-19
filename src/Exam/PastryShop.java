import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sweetType = scanner.nextLine();
        int numberSweet = Integer.parseInt(scanner.nextLine());
        int monthDate = Integer.parseInt(scanner.nextLine());

        switch (sweetType) {
            case "Cake":
                if (monthDate <= 15) {
                    double totalPriceCake = 24.00 * numberSweet;
                    if (totalPriceCake >= 100 && totalPriceCake <= 200) {
                        totalPriceCake = totalPriceCake - 0.15 * (totalPriceCake);
                    } else if (totalPriceCake > 200) {
                        totalPriceCake = totalPriceCake - 0.25 * (totalPriceCake);
                    } else {
                        totalPriceCake = 24.00 * numberSweet;
                    }
                    totalPriceCake = totalPriceCake - 0.10 * (totalPriceCake);
                    System.out.printf("%.2f", totalPriceCake);
                } else if (monthDate > 15 && monthDate <= 22) {
                    double totalPriceCake = 28.70 * numberSweet;
                    if (totalPriceCake >= 100 && totalPriceCake <= 200) {
                        totalPriceCake = totalPriceCake - 0.15 * (totalPriceCake);
                    } else if (totalPriceCake > 200) {
                        totalPriceCake = totalPriceCake - 0.25 * (totalPriceCake);
                    } else {
                        totalPriceCake = 28.70 * numberSweet;
                        ;
                    }
                    System.out.printf("%.2f", totalPriceCake);
                } else {
                    Double totalPriceCake = 28.70 * numberSweet;
                    System.out.printf("%.2f", totalPriceCake);
                }
                break;
            case "Souffle":
                if (monthDate <= 15) {
                    double totalPriceSouffle = 6.66 * numberSweet;
                    if (totalPriceSouffle >= 100 && totalPriceSouffle <= 200) {
                        totalPriceSouffle = totalPriceSouffle - 0.15 * (totalPriceSouffle);
                    } else if (totalPriceSouffle > 200) {
                        totalPriceSouffle = totalPriceSouffle - 0.25 * (totalPriceSouffle);
                    } else {
                        totalPriceSouffle = 6.66 * numberSweet;
                    }
                    totalPriceSouffle = totalPriceSouffle - 0.10 * (totalPriceSouffle);
                    System.out.printf("%.2f", totalPriceSouffle);
                } else if (monthDate > 15 && monthDate <= 22) {
                    double totalPriceSouffle = 9.80 * numberSweet;
                    if (totalPriceSouffle >= 100 && totalPriceSouffle <= 200) {
                        totalPriceSouffle = totalPriceSouffle - 0.15 * (totalPriceSouffle);
                    } else if (totalPriceSouffle > 200) {
                        totalPriceSouffle = totalPriceSouffle - 0.25 * (totalPriceSouffle);
                    } else {
                        totalPriceSouffle = 9.80 * numberSweet;
                        ;
                    }
                    System.out.printf("%.2f", totalPriceSouffle);
                } else {
                    double totalPriceSouffle = 9.80 * numberSweet;
                    System.out.printf("%.2f", totalPriceSouffle);
                }
                break;
            case "Baklava":
                if (monthDate <= 15) {
                    double totalPriceBaklava = 12.60 * numberSweet;
                    if (totalPriceBaklava >= 100 && totalPriceBaklava <= 200) {
                        totalPriceBaklava = totalPriceBaklava - 0.15 * (totalPriceBaklava);
                    } else if (totalPriceBaklava > 200) {
                        totalPriceBaklava = totalPriceBaklava - 0.25 * (totalPriceBaklava);
                    } else {
                        totalPriceBaklava = 12.60 * numberSweet;
                    }
                    totalPriceBaklava = totalPriceBaklava - 0.10 * (totalPriceBaklava);
                    System.out.printf("%.2f", totalPriceBaklava);
                } else if (monthDate > 15 && monthDate <= 22) {
                    double totalPriceBaklava = 16.98 * numberSweet;
                    if (totalPriceBaklava >= 100 && totalPriceBaklava <= 200) {
                        totalPriceBaklava = totalPriceBaklava - 0.15 * (totalPriceBaklava);
                    } else if (totalPriceBaklava > 200) {
                        totalPriceBaklava = totalPriceBaklava - 0.25 * (totalPriceBaklava);
                    } else {
                        totalPriceBaklava = 16.98 * numberSweet;
                        ;
                    }
                    System.out.printf("%.2f", totalPriceBaklava);
                } else {
                    double totalPriceBaklava = 16.98 * numberSweet;
                    System.out.printf("%.2f", totalPriceBaklava);
                }
                break;
        }
    }
}