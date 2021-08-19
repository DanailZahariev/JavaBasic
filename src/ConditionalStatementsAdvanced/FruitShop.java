import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double totalPrice = 0;
        switch (dayOfWeek){
            case"Monday":
            case"Tuesday":
            case"Wednesday":
            case"Thursday":
            case"Friday":
            switch (fruit){
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
            }break;
            case "Saturday":
            case "Sunday":
            switch (fruit){
                case "banana":
                    totalPrice = quantity * 2.7;
                    break;
                case "apple":
                    totalPrice = quantity * 1.25;
                    break;
                case "orange":
                    totalPrice = quantity * 0.90;
                    break;
                case "grapefruit":
                    totalPrice = quantity * 1.60;
                    break;
                case "kiwi":
                    totalPrice = quantity * 3;
                    break;
                case "pineapple":
                    totalPrice = quantity * 5.6;
                    break;
                case "grapes":
                    totalPrice = quantity * 4.20;
                    break;
                default:
                    System.out.println("error");
                    break;
            }
               break;
            default:
                System.out.println("error");

        }if (totalPrice>0){
            System.out.printf("%.2f",totalPrice);
        }
    }
    }






