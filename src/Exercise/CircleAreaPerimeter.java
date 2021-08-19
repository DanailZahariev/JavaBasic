import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double circleArea =r*r*Math.PI;
        double circlePerimeter=2*Math.PI*r;
        System.out.printf("%.2f\n",circleArea);
        System.out.printf("%.2f",circlePerimeter);
    }
}
