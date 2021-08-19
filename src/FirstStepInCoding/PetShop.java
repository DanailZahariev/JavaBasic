import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int otherDogs = Integer.parseInt(scanner.nextLine());
        double totalAmount = (dogs * 2.5) + (otherDogs *4);
        System.out.println(totalAmount );
}
}