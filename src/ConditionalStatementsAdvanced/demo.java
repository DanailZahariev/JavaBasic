import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String fruitType = myScan.nextLine();
        String dayOfTheWeek = myScan.nextLine();
        double quantity = Double.parseDouble(myScan.nextLine());
        double totalPrice = 0;
        switch (dayOfTheWeek) {

            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruitType) {
                    case "banana":
                        totalPrice = quantity * 2.5;
                        break;
                    case "apple":
                        totalPrice = quantity * 1.2;
                        break;
                    case "orange":
                        totalPrice = quantity * 0.85;
                        break;
                    case "grapefruit":
                        totalPrice = quantity * 1.45;
                        break;
                    case "kiwi":
                        totalPrice = quantity * 2.7;
                        break;
                    case "pineapple":
                        totalPrice = quantity * 5.5;
                        break;
                    case "grapes":
                        totalPrice = quantity * 3.85;
                        break;
                    default:
                        System.out.println("error");
                        break;

                }
                break;


            case "Saturday":
            case "Sunday":
                switch (fruitType) {
                    case "banana":
                        totalPrice = quantity * 2.7;
                        break;
                    case "apple":
                        totalPrice = quantity * 1.25;
                        break;
                    case "orange":
                        totalPrice = quantity * 0.9;
                        break;
                    case "grapefruit":
                        totalPrice = quantity * 1.6;
                        break;
                    case "kiwi":
                        totalPrice = quantity * 3.0;
                        break;
                    case "pineapple":
                        totalPrice = quantity * 5.6;
                        break;
                    case "grapes":
                        totalPrice = quantity * 4.2;
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;

            default:
                System.out.println("error");
                break;

        }
        if (totalPrice > 0) {
            System.out.printf("%.2f", totalPrice);
        }

    }
}


