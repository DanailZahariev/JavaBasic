import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studio = 0;
        double apartment = 0;
        if ("May".equals(month)||"October".equals(month)){
            studio=nights*50;
            apartment=nights*65;
            if (nights>7&&nights<=14){
                studio=studio*0.95;
            }if (nights>14){
                studio=studio*0.7;
                apartment=apartment*0.9;
            }
        }else if ("June".equals(month)||"September".equals(month)){
            studio=nights*75.20;
            apartment=nights*68.70;
            if (nights>14){
                studio=studio*0.8;
                apartment=apartment*0.9;
            }
        }else if ("July".equals(month)||"August".equals(month)){
            studio=nights*76;
            apartment=nights*77;
            if (nights>14){
                apartment=apartment*0.9;
            }
        }
        System.out.printf("Apartment: %.2f lv.\n",apartment);
        System.out.printf("Studio: %.2f lv.",studio);
    }
}
