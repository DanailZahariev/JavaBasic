import java.io.PrintStream;
import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        String inputUnit = scanner.nextLine();
        String outputUnit = scanner.nextLine();
        double result = 0;
        if (inputUnit.equals("mm")){
         num=num/1000;
        }else if(inputUnit.equals("cm")){
            num=num/100;
        }
        if (outputUnit.equals("mm")){
            num=num*1000;

        }else if(outputUnit.equals("cm")){
            num=num*100;
        }
        System.out.printf("%.3f", num);
    }
}
