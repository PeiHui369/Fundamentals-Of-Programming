import java.util.Scanner;

public class T6Q2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 integers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        numsInDescending(a,b,c);
    }

    static void numsInDescending(int a, int b, int c) {
        if(a>b && a>c){
            System.out.println(a +", "+Math.max(b,c)+ ", " + Math.min(b,c));
        }else if(b>a && b>c){
            System.out.println(b +", "+Math.max(a,c)+ ", " + Math.min(a,c));
        }else if(c>a && c>b) {
            System.out.println(c + ", " + Math.max(a, b) + ", " + Math.min(a, b));
        }
    }
}
