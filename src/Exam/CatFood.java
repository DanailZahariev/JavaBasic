import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCat = Integer.parseInt(scanner.nextLine());
        int groupOne = 0;
        int groupTwo = 0;
        int groupThree = 0;
        double totalFood = 0;
        for (int i = 1; i <= countCat; i++) {
            double food = Double.parseDouble(scanner.nextLine());
            if (food >= 100 && food < 200) {
                groupOne++;
            } else if (food >= 200 && food < 300) {
                groupTwo++;
            } else if (food >= 300 && food < 400) {
                groupThree++;
            }
            totalFood += food;
        }
        double sum = (totalFood / 1000) * 12.45;
        System.out.println("Group 1: " + groupOne + " cats.");
        System.out.println("Group 2: " + groupTwo + " cats.");
        System.out.println("Group 3: " + groupThree + " cats.");
        System.out.printf("Price for food per day: %.2f lv.", sum);
    }
}
