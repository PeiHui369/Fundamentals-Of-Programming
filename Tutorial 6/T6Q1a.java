import java.util.Scanner;

public class T6Q1a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 integer: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("The maximum number is "+maxNum(a,b,c));
    }

    static int maxNum(int a, int b, int c){
        int maxNum = 0;
        if(Math.max(a,b) == a && Math.max(a,c)==a) {
            maxNum = a;
        }else if(Math.max(a,b) == b && Math.max(b,c)==b){
            maxNum = b;
        }else if(Math.max(a,c) == c && Math.max(b,c)==c){
            maxNum = c;
        }else if(a==b || b==c || a==c){
            return -1;
        }
        return maxNum;
    }

}