import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            if (value > maxNum) {
                maxNum = value;
            }
            if (value < minNum) {
                minNum = value;
            }

        }
        System.out.println("Max number: " + maxNum);
        System.out.println("Min number: " + minNum);
    }
}
