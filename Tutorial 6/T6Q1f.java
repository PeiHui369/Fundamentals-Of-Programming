import java.util.Random;
import java.util.Scanner;

public class T6Q1f {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of number to generate: ");
        int n = in.nextInt();
        randomNumGenerator(n);
    }

    static void randomNumGenerator(int n) {
        Random rand = new Random();
        int i = 0;
        int[] arr = new int[n];
        while(i<n){
            arr[i] = rand.nextInt(100);
            i++;
        }

        for(int j=0; j<arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}