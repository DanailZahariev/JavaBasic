import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.next());
        int length = Integer.parseInt(scanner.next());
        int size = width * length;
        String input = scanner.next();
        while (!input.equals("STOP")) {
            int piece = Integer.parseInt(input);
            size -= piece;
            if (size <= 0) {
                break;
            }
            input = scanner.next();
        }
        if (size <= 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(size));
        }else {
            System.out.printf("%d pieces are left.", size);
        }
    }
}
