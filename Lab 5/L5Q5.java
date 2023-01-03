<FINAL ANS>
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int search = 0;

        System.out.println("A list of 20 random integer within 0 to 100");

        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));

        reverse(arr);

        System.out.print("Enter a number to search: ");
        search = sc.nextInt();

        linearSearch(arr, search);
        binarySearch(arr, search);

        sc.close();
    }

    static void reverse(int[] array) {

        int n = array.length;

        System.out.println("Array in descending order");

        Arrays.sort(array);

        for (int j = 0; j < n / 2; j++) {
            int temp = array[j];
            array[j] = array[(n - 1) - j];
            array[(n - 1) - j] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

    static void linearSearch(int[] array, int n) {

        int loopCount = 0;

        for (int i: array) {
            if (i == n) { break; }
            loopCount++;
        }

        if (loopCount < array.length) {
            System.out.printf("%d found\nLinear Search - %d loop(s)\n", n, loopCount);
        }else{
            System.out.println("Not found");
        }
    }

    static void binarySearch(int[] array, int n) {
        int low = 0, high = array.length-1, mid = 0, loop=0;
        while (low < high){
            mid = (low + high)/2;
            if( n == array[mid]){System.out.println(mid);}
            else if( n > array[mid]){low = mid+1; } //n is on right side
            else {high = mid -1;} //n is on left side
        loop++;
        }
        if(mid == n){
        System.out.println("Binary Search - "+loop+" loop(s)");}
        else{System.out.println("Not found");}
    }
}

=================================================================

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class L5Q5 {

    public static void main(String[] args) {

        int[] arr = new int[20];

        System.out.println("A list of 20 random integer within 0 to 100");
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(new int[][]{arr}, Collections.reverseOrder());

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number to search: ");
        int search = keyboard.nextInt();

        linearSearch(arr, search);
        binarySearch(arr, search);
    }

    static void linearSearch(int[] array, int key) {
        int ctr = 0;
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                System.out.println(i);
                ctr++;
            }
        }
        System.out.println("Number of loop: "+ctr);
    }
        static void binarySearch(int[] array, int key) {
            int low = 0;
            int high = array.length - 1;
            int middle = 0;
            int loop = 0;
            while (high >= low) {
                middle = low + (high-low) / 2;
                if (key == array[middle]){
                    System.out.println(middle);
                     break;
                }
                else if (key < array[middle]) {
                    low = middle + 1;
                    loop++;
                }
                else {
                    high = middle - 1;
                    loop++;
                }
            }
        }
}

//BinarySearch does not print anything

>>
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class L5Q5 {

    public static void main(String[] args) {

        int[] arr = new int[20];

        System.out.println("A list of 20 random integer within 0 to 100");
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(new int[][]{arr}, Collections.reverseOrder());
        System.out.println("Array in descending order:");
        for (int i = 0; i < 20; i++) {
            arr[i] *= -1;
            System.out.print(arr[i] + " ");
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number to search: ");
        int search = keyboard.nextInt();

        linearSearch(arr, search);
        binarySearch(arr, search);
    }

    static void linearSearch(int[] array, int key) {
        int i = 0;
        for (; i < array.length; i++) {
            if (key == array[i]) {
                System.out.println(key + " found");
                System.out.println("Linear search - " + i + +" loop(s)");
                return; //back to main function, won't continue below
            }
        }
        System.out.println(key + " not found");
    }
        static void binarySearch(int[] array, int key) {
            int low = 0;
            int high = array.length - 1;
            int middle = 0;
            int loop = 1; //first one counts
            while (high >= low) {
                middle = (low + high)/2
                if (key == array[middle]){
                    System.out.println(middle);
                    System.out.println("Linear search - " + i + +" loop(s)");
                     return;
                }
                else if (key < array[middle]) {
                    low = middle + 1;
             
                }
                else {
                    high = middle - 1;
                
                }
                 loop++;
            }
            
        }
}


/*
To print in descending order:
Arrays.sort(arr)
in for loop: arr[i] *= -1;
*/

// Descending so the binarySearch is not same with lecture example
