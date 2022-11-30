
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
                Random rand = new Random(); //Put it outside
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

// When generate, all the work hour same
// Cannot control then no. of employee via N

>>
import java.util.Random;
import java.util.Scanner;

public class L5Q3 {
    public static void main(String[] args) {
        //Prompt user input for no. of employees, N
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int N = keyboard.nextInt();

        //Generate random seven day work hours
        Random rand = new Random();
        //Initialize var
        int workHour=0, sum=0, all_sum=0;
        
        for(int i = 1; i <= N; i++){
            sum = 0; //reset sum
            for(int j = 1; j <= 7; j++){
  
                workHour = rand.nextInt(8)+1;
                sum += workHour;
               
                System.out.printf("Work hour %d: %d\n",j, workHour);
            }
            System.out.printf("The total hours for %d employee is %d hours.\n",i , sum);
            all_sum += sum;           
        }
        System.out.printf("Total work hours for all employees is %d hour(s)\n", all_sum);
    }
}

