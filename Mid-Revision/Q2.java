import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        String durian = "";
        int price;
        double kg, totalSale = 0;
        Scanner a = new Scanner (System.in);

        do {
            //input = 1 mark
            System.out.print("Enter the type of durian [Quit] to terminate: ");
            durian = a.nextLine();

            //terminate = 1 mark
            if (durian.equals("Quit")) {
                break;
            }

            //input = 1 mark
            System.out.print("Enter the sales in kg: ");
            kg = a.nextDouble();

            //if comparison and sales calculation = 3 marks
            if (durian.equals("MK")) {
                totalSale += kg * 25;
            } else if (durian.equals("HL")) {
                totalSale += kg * 22;
            } else if (durian.equals("D24")) {
                totalSale += kg * 20;
            } else if (durian.equals("UM")) {
                totalSale += kg * 18;
            }
            a.nextLine();
        }
        while (!durian.equals("Quit")); //loop = 2 marks;
        //output = 1 mark
        //2 decimal places = 1 mark
        System.out.printf("Total Sales: %.2f\n", totalSale);
        }
    }

