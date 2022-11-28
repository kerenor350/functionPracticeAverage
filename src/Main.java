import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float num1;
        float num2;
        float num3;
        System.out.println ("The average of your numbers is " + averageSum());
    }
    public static float averageSum(){
               Scanner scanner = new Scanner(System.in);
            System.out.println(" Enter three numbers");
            float num1 = scanner.nextFloat();
            float num2 = scanner.nextFloat();
            float num3 = scanner.nextFloat();
        float sum = num1 + num2 + num3;
        float average = sum / 3;
        return average;
    }

    }

