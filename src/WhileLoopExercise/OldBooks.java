import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        String input = scanner.nextLine();
        int count = 0;
        boolean founded = false;
        while (!input.equals("No More Books")) {
            if (bookName.equals(input)) {
                founded = true;
                break;
            }
            count++;
            input = scanner.nextLine();
        }
        if (founded) {
            System.out.printf("You checked %d books and found it.", count);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", count);
        }
    }
}
