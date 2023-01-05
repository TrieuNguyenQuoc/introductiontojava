import java.util.Scanner;

public class canNang {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("you weight (inkg:");
        weight = sc .nextDouble();
        System.out.print("you height (in meter):");
        height = sc.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi", "Interpretation\n");
        if (bmi<18);
            System.out.printf("%-20.20f%s",bmi,"Underweight");
            else if (bmi<25.0);

    }
}