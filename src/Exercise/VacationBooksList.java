import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPages = Integer.parseInt(scanner.nextLine());
        int readPages = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int totalHours = countPages/readPages;
        int neededHours = totalHours/days;
        System.out.println(neededHours);


    }
}
