import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int x,y;
        String move;
        Scanner a = new Scanner(System.in);

        //input = 3 marks

        System.out.print("Enter the coordinate X and Y: ");
        x = a.nextInt();
        y = a.nextInt();
        System.out.print("Enter the move: ");
        move = a.nextLine();

        //output = 1 mark
        System.out.println("Initial Coordinate (" +x+ "," +y+ ")");

        //loop = 2 mark
        for(int i = 0; i < move.length(); i++) {
            //if comparison = 3 mark
            if (move.charAt(i) == 'L') {
                x--;
            } else if (move.charAt(i) == 'R') {
                x++;
            } else if (move.charAt(i) == 'D') {
                y--;
            } else if (move.charAt(i) == 'U') {
                y++;
            }
        }

        //output = 1 mark
        System.out.println("Final Coordinate(" +x+ "," +y+ ")");
    }
}
