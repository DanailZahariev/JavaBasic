import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int grade = 1;
        double totalScore = 0;
        int poorGrade = 0;
        while (grade <= 12) {
            double score = Double.parseDouble(scanner.nextLine());
            if (score < 4) {
                poorGrade++;
                if (poorGrade == 2) {
                    break;
                }
                continue;
            }
            totalScore += score;
            grade++;
        }

        if (poorGrade == 2) {
            System.out.printf("%s has been excluded at %d grade", name, grade);
        } else {
            double averageGrade = totalScore / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }
    }
}
