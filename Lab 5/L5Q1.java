import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of student:");
        int N = scanner.nextInt();
        int[] score = new int[N];

        Random random = new Random();
        int sum=0;
        for(int i=0; i<N; i++){
            score[i]= random.nextInt(101);
            sum+=score[i];
        }

        Arrays.sort(score);
        System.out.println("List of score: "+Arrays.toString(score));
        System.out.println("Lowest score: "+score[0]);
        System.out.println("Highest score: "+score[N-1]);
        System.out.println("Average score: "+ (sum/N));

    }
}

>>
Enter the number of student:
10
List of score: [8, 14, 20, 25, 29, 55, 73, 76, 80, 100]
Lowest score: 8
Highest score: 100
Average score: 48
==============================================================

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
