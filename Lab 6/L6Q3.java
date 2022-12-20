import java.util.Arrays;
import java.util.Scanner;

public class L6Q3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] arr = new int[4];

        int i = 0;
        while(i<4) {
            System.out.println("Enter 1 digit integer: ");
            int num = in.nextInt();
            arr[i] = num;
            System.out.println("Number entered saved. Next...");
            i++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(reversed(arr));
    }

    static String reversed(int[] array){
        int j;
        int temp = 0;
        for(j = 0; j<array.length/2; j++){
            array[j] = temp;
            array[j] = array[array.length-j];
            array[array.length-j] = temp;
        }
        return Arrays.toString(array);

    }
}