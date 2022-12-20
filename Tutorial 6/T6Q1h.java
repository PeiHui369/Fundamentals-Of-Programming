import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class T6Q1h {
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
            arr[i] = rand.nextInt(11);
            i++;
        }

        System.out.println(Arrays.toString(arr));

        for(int j=0; j<arr.length; j++){
            for(int k=1; k<arr.length-1; k++){
                if(arr[j] == arr[k]) {
                    System.out.println(arr[k]);
            }
            }
        }
    }
}
