import java.util.Scanner;

public class L6Q5{
    static int score = 0;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a,b,c;

        do {
            System.out.println("\nEnter negative number to quit. ");
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();

            multiplication(a,b,c);

            if (a < 0 || b < 0 || c < 0) {
                multiplication(a,b,c);
                break;
            }

        }while(a > 0 && b > 0 && c > 0);

        System.out.println("\nYour Score is "+score);
    }

        public static void multiplication(int a, int b, int c){
        if(a * b == c){
            score++;
        }
            System.out.printf("%d x %d = %d",a,b,c);
    }
}