import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededHours = Integer.parseInt(scanner.next());
        int daysFirmHave = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.next());
        double education = daysFirmHave*0.90;
        double extraHoursEmployee = employees*2*education;
        double totalHours = Math.floor((education*8*employees)+extraHoursEmployee);
        System.out.println(totalHours);




      //  double daysNotWorking = daysFirm*0.90;
      //  double WorkingHoursDays = daysFirm*8;
       // double extraWork = (employees*2)*daysFirm;
       // double totalHours = extraWork*daysNotWorking;

        }
    }

