import java.util.Scanner;

class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Income = Double.parseDouble(scanner.nextLine());
        double AvGrade = Double.parseDouble(scanner.nextLine());
        double MinSalary = Double.parseDouble(scanner.nextLine());
        double SocSch = 0.35 * MinSalary;
        double GradeSch = 25 * AvGrade;

        if (AvGrade >= 5.5 & Income < MinSalary & SocSch >= GradeSch) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(SocSch));
        }  else if (AvGrade >= 5.5 & Income < MinSalary & SocSch < GradeSch) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(GradeSch));
        }  else if (AvGrade > 4.5 & Income < MinSalary) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(SocSch));
        }  else if (AvGrade >= 5.5){
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(GradeSch));
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}