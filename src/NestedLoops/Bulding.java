import java.util.Scanner;

public class Bulding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.next());
        int rooms = Integer.parseInt(scanner.next());
        for (int flooor = floors; flooor >= 1; flooor--) {
            for (int room = 0; room < rooms; room++) {
                if (flooor == floors) {
                    System.out.printf("L%d%d ", flooor, room);
                } else if (flooor % 2 == 1) {
                    System.out.printf("A%d%d ", flooor, room);
                } else if (flooor % 2 == 0) {
                    System.out.printf("O%d%d ", flooor, room);
                }
            }
            System.out.println();
        }
    }
}
