
import java.util.Scanner;

public class T6Q1g {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = in.nextInt();
        areaCircumference(r);
    }

    static void areaCircumference(int r) {
        double area = Math.PI * Math.pow(r, 2);
        double circumference = 2 * Math.PI * r;

        System.out.printf("Area is %.2f and circumference is %.2f.", area, circumference);
    }
}