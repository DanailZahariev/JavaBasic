import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if (type.equals("square")) {
            double a1 = Double.parseDouble(scanner.nextLine());
            double squareArea = a1 * a1;
            System.out.printf("%.3f", squareArea);
        } else if (type.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            double rectangleArea = sideA * sideB;
            System.out.printf("%.3f", rectangleArea);
        } else if (type.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double circleArea = Math.PI * radius * radius;
            System.out.printf("%.3f", circleArea);
            {
            }  } else if (type.equals("triangle")) {
                double b = Double.parseDouble(scanner.nextLine());
                double bh = Double.parseDouble(scanner.nextLine());
                double triangleArea = b * bh / 2;
                System.out.printf("%.3f", triangleArea);
            }
        }
    }