import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jury = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double totalGrade = 0;
        int countGrade = 0;
        while (!input.equals("Finish")) {
            String presentation = input;
            double currentGrade = 0;
            for (int i = 1; i <= jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                countGrade++;
                currentGrade += grade;

            }
            totalGrade += currentGrade;
            System.out.printf("%s - %.2f.%n", presentation, currentGrade / jury);
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", totalGrade / countGrade);
    }
}
