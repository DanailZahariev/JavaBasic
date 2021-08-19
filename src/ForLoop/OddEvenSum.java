import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int evenPosition = 0;
        int oddPosition = 0;
        for (int number = 1; number<=n; number++){
            int value = Integer.parseInt(scanner.nextLine());
            if (number %2 ==1){
                oddPosition += value;
            }else{
                evenPosition +=value;
            }
        }
        if (evenPosition==oddPosition){
            System.out.println("Yes");
            System.out.println("Sum = " + oddPosition);
        }else{
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(evenPosition-oddPosition));
        }

    }
}
