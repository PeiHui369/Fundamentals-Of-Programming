
import java.util.Random;
import java.util.Scanner;

public class L5Q3 {
    public static void main(String[] args) {
        //Prompt user input for no. of employees, N
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int N = keyboard.nextInt();

        //Generate random seven day work hours
        //Initialize var
        int workHour=0, sum=0;
        //Create array
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= 7; j++){
                Random rand = new Random();
                workHour = rand.nextInt(8)+1;
                sum += workHour;
                for(int k = 1; k<=7; k++){
                    System.out.printf("Work hour %d: %d\n",k, workHour);
                }
                System.out.printf("The total hours for %d employee is %d hours.\n",N, sum);
            }
        }
    }
}
