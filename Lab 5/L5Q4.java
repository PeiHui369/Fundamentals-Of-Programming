
public class L5Q4 {

    public static void main(String[] args) {
        int[][] matrix = {{1,5,7},{3,6,9},{5,3,8}};
        System.out.println("Original matrix: ");
        for(int i = 0; i <= matrix.length-1; i++){
            for(int j = 0; j <= matrix[0].length-1; j++){
                System.out.print(matrix[i][j] + " ");
                if(j>0 && j%2 == 0){System.out.print("\n");}
            }
        }

        System.out.println("Matrix after rotating 90 degrees(transpose): ");
        //1st Tranpose: 1st row become 1st column
        for(int i = 0; i<matrix.length;i++){
            for(int j = i; j < matrix[i].length; j++){
                //checks if i is not equal to j because in transpose matrix diagonal elements will not swap
                if(i!=j){
                    //Swapping elements
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for(int i = 0; i <= matrix.length-1; i++){
            for(int j = 0; j <= matrix[0].length-1; j++){
                System.out.print(matrix[i][j] + " ");
                if(j>0 && j%2 == 0){System.out.print("\n");}
            }
        }

        //2nd Swap element: 1st column --> last column
        System.out.println("Matrix after rotating 90 degrees(swap elements): ");
        int r = 3; //n is no. of rows
        int c = 3; //c is no. of columns
        for(int i = 0; i < r; i++){
            for(int j = i; j < c/2; j++){
                if(i!=j){
                    //swapping elements of the first column with the last column
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][c-j-1];
                    matrix[i][c-j-1] = temp;
                }
            }
        }
        for(int i = 0; i <= matrix.length-1; i++){
            for(int j = 0; j <= matrix[0].length-1; j++){
                System.out.print(matrix[i][j] + " ");
                if(j>0 && j%2 == 0){System.out.print("\n");}
            }
        }
    }
}