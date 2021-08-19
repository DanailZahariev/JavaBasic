import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.next());// височина на къщата
        double y = Double.parseDouble(scanner.next());//дължина на странична стена
        double h = Double.parseDouble(scanner.next());//височина на триъгълна стена на покрива
        double windowsArea = 1.5*1.5;
        double doorArea = 1.2*2;
        double doorWall = x*x;
        double doorWallSum = (x*x)-doorArea;
        double sideWallSum = (x*y)-windowsArea;
        double totalGreenPaint = doorWall+doorWallSum+(2*sideWallSum);
        double greenPaintNeeeded = totalGreenPaint/3.4;
        double roofTriangle = x*h;
        double roofRectangle = 2 *x*y;
        double totalRedPaint = roofTriangle+roofRectangle;
        double totalRedPaintNeeded = totalRedPaint/4.3;
        System.out.printf("%.2f%n",greenPaintNeeeded);
        System.out.printf("%.2f",totalRedPaintNeeded);

    }
}
