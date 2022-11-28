import java.util.Scanner;

public class L5Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = 0, sum = 0, temp = 0;

        System.out.print("Enter number of employee: ");
        N = sc.nextInt();

        System.out.printf("           %7s%7s%7s%7s%7s%7s%7s%20s\n", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun", "Total Work Hours");

        for (int i = 1; i <= N; i++) {

            sum = 0;

            System.out.printf("Employee %s%d", i < 10 ? " " : "", i);

            for (int j = 0; j < 7; j++) {

                temp = (int) (Math.random() * 7 + 1);

                System.out.printf("%7d", temp);

                sum += temp;
            }

            System.out.printf("%20s\n", sum);
        }

        sc.close();
    }
}

>>
Enter number of employee: 2
               Mon    Tue    Wed    Thu    Fri    Sat    Sun    Total Work Hours
Employee  1      6      5      4      4      5      3      4                  31
Employee  2      3      3      5      3      7      6      1                  28

    
