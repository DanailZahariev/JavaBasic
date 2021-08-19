import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.next());
        int end = Integer.parseInt(scanner.next());
        int magicNumber = Integer.parseInt(scanner.next());
        int counter = 0;
        boolean isFound = false;
        for (int number1 = start; number1 <= end; number1++) {
            for (int number2 = start; number2 <= end; number2++) {
                counter++;
                if (number1 + number2 == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, number1, number2, magicNumber);
                    isFound = true;
                    return;
                }
            }
        }
        if (isFound == false) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
