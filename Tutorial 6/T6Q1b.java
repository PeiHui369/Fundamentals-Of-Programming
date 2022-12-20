import java.util.Scanner;

public class T6Q1b {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a = in.nextInt();
        System.out.println(a + " is a square number? " + squareNum(a));
    }

    static boolean squareNum(int n){
        int b = (int)Math.sqrt(n);
        return (Math.pow(b,2) == n);
    }

}