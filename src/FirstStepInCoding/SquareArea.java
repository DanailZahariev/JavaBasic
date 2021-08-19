import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int squareSide = Integer.parseInt(scanner.nextLine());
        int squareArea = squareSide * squareSide;
        System.out.println(squareArea);

    }
}