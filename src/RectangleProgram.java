import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args){
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        width = sc.nextFloat();
        System.out.println("Enter height:");
        height = sc.nextFloat();
        float area = width * height;
        System.out.println("Area is:" + area);
    }
}
