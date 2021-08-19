import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String grade = scanner.nextLine();
        int night = days-1;
        double pricePerNight = 0;
        if(typeRoom.equals("room for one person")){
            pricePerNight=18;
        }else if(typeRoom.equals("apartment")){
            pricePerNight=25;
        }else if(typeRoom.equals("president apartment")){
            pricePerNight=35;
        }double finalSum=night*pricePerNight;
        switch (typeRoom){
            case "apartment":
                if (night<10){
                    finalSum=finalSum-0.30*finalSum;
                }else if(night>=10&&night<=15){
                    finalSum=finalSum-0.35*finalSum;
                }else if(night>15){
                    finalSum=finalSum-0.50*finalSum;
                }
                break;
            case "president apartment":
                if (night<10){
                    finalSum=finalSum-0.10*finalSum;
                }else if (night>=10&&night<=15){
                    finalSum=finalSum-0.15*finalSum;
                }else if(night>15){
                    finalSum=finalSum-0.20*finalSum;
                }
                break;
        }if (grade.equals("positive")){
            finalSum=finalSum+0.25*finalSum;
        }else if(grade.equals("negative")){
            finalSum=finalSum-0.10*finalSum;
        }
        System.out.printf("%.2f",finalSum);
    }
}
