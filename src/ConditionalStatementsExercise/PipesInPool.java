import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());
        double P1Liters = P1*H;
        double P2Liters = P2*H;
        double totalLiters=P1Liters+P2Liters;
        double fullPool = (totalLiters/V)*100.0;
        double totalP1 = (P1Liters/totalLiters)*100.0;
        double totalP2 = (P2Liters/totalLiters)*100.0;
        double overWater=totalLiters-V;
        if (totalLiters<=V){
            System.out.printf("The pool is %.2f%% full. Pipe 1:%.2f%%. Pipe 2:%.2f%%.",fullPool,totalP1,totalP2);

        }else if(totalLiters>V){

            System.out.printf("For 2.50 hours the pool overflows with %.2f liters.", overWater);
        }
}



    }


