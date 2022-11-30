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



>>
    Scanner keyboard = new Scanner (System.in);
    int N = keyboard.nextInt();
    int[] scores = new int[N];
    for(int i = 0; i<N; i++){
        scores[i] = (int)(Math.random() * 101)
            //if (score[i] == 100) {System.out.print(scores[i])} --> to check can it generate 100
        System.out.printf("%d\t ", scores]i]);
        
        if(i % 10 == 9){
            System.out.println(" ")
        }       
    }

int max = scores[0], min = scores[0];
int sum = 0;
for(int i = 0; i<N; i++) {
    sum += scores[i];
    max = Math.max(scores[i],max);
    min = Math.min(scores[i],min);
}

double avg = (double) sum/ (double) N;

System.out.printf("Highest Score: %d
        
        // implement small thing, run to check if have bugs
