import java.util.Scanner;

public class T6Q1c {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Number of elements: ");
        int a = in.nextInt();
        System.out.println("Number of different k-element subsets: ");
        int b = in.nextInt();
        System.out.println(C(a,b));
    }

    static int factorial(int n){
        for(int i = n-1; i>0; i--){
            n *= i;
        }
        return n;
    }

    static int C(int n, int k){
        return (factorial(n)/(factorial(k)*(factorial(n-k))));
    }

}