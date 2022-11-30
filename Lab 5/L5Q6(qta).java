import java.util.ArrayList;
import java.util.Scanner;

public class L5Q6 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> temp = new ArrayList<>();
        int rows = 0;

        System.out.print("Enter the number of rows of Pascal Triangle to generate: ");
        rows = keyboard.nextInt();

        if (rows == 1) {
            System.out.println(1);
        }
        else if (rows == 2) {
            System.out.println("1 0\n1 1");
        }
        else {

            System.out.printf("1 %s\n", ("0 ").repeat(rows - 1));
            System.out.printf("1 1 %s\n", ("0 ").repeat(rows - 2));
            temp.add(0);
            temp.add(1);
            temp.add(1);
            temp.add(0);

            for (int i = 2; i < rows; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.printf("%d ", temp.get(j) + temp.get(j + 1));
                    temp.add(temp.get(j) + temp.get(j + 1));
                }
                System.out.printf("%s\n", ("0 ").repeat(rows - i - 1));
                for (int k = 0; k <= i; k++) {
                    temp.remove(2);
                }
                temp.add(0);
            }
        }

        keyboard.close();
    }
}


>>
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the row of Pascal's triangle to generate: ");
    int N = in.nextInt();
    int[][] tri = new int [N][N];

    // 2nd will start Pascal Triangle
    tri[0][0] = 1; //to cover edge case, first element always 1
    for(int i = 1 ; i<N ; i++){
        tri[1][0] = 1;
        for(int j = 1; j<i; j++){
            tri[i][j] = tri[i-1][j] + tri [i-1][j-1];
    }
}
    
    // 1st all will get 0
    for(int i = 0; i < N; i++){
        for(int j= 0； j<N; j++){
            System.out.printf("%d ", tri[i][j]);
        }
        System.out.println("");
    }
    
  
