import java.util.Scanner;
public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int deskRows = (int) ((width * 100) /120);
        int deskNumber = (int) (((length * 100) - 100)  / 70);
        int allDeskPlace = (deskRows * deskNumber) - 3;
        System.out.println(allDeskPlace);

    }
}