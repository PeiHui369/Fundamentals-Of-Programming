import java.util.Arrays;
import java.util.Scanner;

public class L5Q1 {
    public static void main(String[] args) {
        //Prompt user enter N students
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int N = keyboard.nextInt();

        //Randomly generate N student scores
        //Create array, size = no. of students
        double[] score = new double[N];

        double sum = 0;
        for(int i = 0; i < N; i++){
            score[i] += Math.round(Math.random() * 10000)/ 100.0; //To have score with decimal places
            sum += score[i];

            System.out.printf("Score %d: %.2f\n", (i+1), score[i]);
        }
        Arrays.sort(score); //sort array to ascending order

        System.out.printf("The highest score is %.2f. \nThe lowest score is %.2f.\n",score[N-1], score[0]);
        System.out.printf("The average score is %.2f.", sum/N);
    }
}
