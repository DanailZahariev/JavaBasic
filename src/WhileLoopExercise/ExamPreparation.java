import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poorTask = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int poorGrade = 0;
        double averageScore = 0;
        int taskCount = 0;
        String lastTask = "";
        while (!input.equals("Enough")) {
            String taskName = input;
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                poorGrade++;
            }
            if (poorGrade >= poorTask) {
                break;
            }
            taskCount++;
            averageScore += grade;
            lastTask = taskName;
            input = scanner.nextLine();
        }
        if (poorTask == poorGrade) {
            System.out.printf("You need a break, %d poor grades.", poorTask);
        } else {
            System.out.printf("Average score: %.2f%n", averageScore / taskCount);
            System.out.printf("Number of problems: %d%n", taskCount);
            System.out.printf("Last problem: %s", lastTask);

        }

    }
}

