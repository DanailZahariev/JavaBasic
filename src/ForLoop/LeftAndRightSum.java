package ForLoop;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= n; i++){
            int value = Integer.parseInt(scanner.nextLine());
            sum1 += value;

        }
        for (int i = 1; i <= n; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum2 += value;
        }

        int diffSum = Math.abs(sum1 - sum2);
        if (diffSum == 0){
            System.out.println(" Yes, sum = " + sum1);
        }else {
            System.out.println(" No, diff = " + diffSum);
        }
    }
}