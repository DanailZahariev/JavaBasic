import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int CountProjects = Integer.parseInt(scanner.nextLine());
        int needHours = CountProjects * 3;
        System.out.printf( "The architect %s will need %d hours to complete %d project/s.", name, needHours, CountProjects);


    }
}

