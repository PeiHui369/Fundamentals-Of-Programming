public class Main {

    public static void main(String[] args) {

        int[][] matrix = {{1,5,7},{3,6,9},{5,3,8}};
        int[][] matrix2 = new int [matrix.length][matrix[0].length];
        
        for(int i = 0, j = matrix.length-1; i < matrix.length; i++, j--) {  #
                matrix2[0][j] = matrix[i][0];                               #
                matrix2[1][j] = matrix[i][1];                               #
                matrix2[2][j] = matrix[i][2];                               #
            }
        
        for(int i = 0; i <= matrix.length-1; i++){
            for(int j = 0; j <= matrix[0].length-1; j++){
                System.out.print(matrix[i][j] + " ");
                if(j>0 && j%2 == 0){System.out.print("\n");}                # To print next line in matrix
            }
        }

        for(int i = 0; i <= matrix2.length-1; i++){
            for(int j = 0; j <= matrix2[0].length-1; j++){
                System.out.print(matrix2[i][j] + " ");
                if(j>0 && j%2 == 0){System.out.print("\n");}
            }
        }

    }
}

>>
1 5 7 
3 6 9 
5 3 8
    
5 3 1 
3 6 5 
8 9 7 

===========================================================================
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
                    //swab 2 variables, need extra var to score 1 value
                    /* var A, var B
                    var temp_c = A
                    A = B;
                    B = temp_C*/
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
        
        //Swapping elements
        for(int i = 0; i < r; i++){
                int temp = matrix [i][0];
                matrix[i][0] = matrix [1][2]
                matrix[i][2] = temp;
        }
        
        /* for(int i = 0; i < r; i++){ //i is iterating the rows
            for(int j = i; j < 1; j++){ //j < c/2; c/2 =1
                System.out.printf("%d %d/n", i, j);
                if(i!=j){
                    //swapping elements of the first column with the last column
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][2-j]; //c-1=2
                    matrix[i][2-1] = temp;
                }
            }
        }*/
        
        for(int i = 0; i <= matrix.length-1; i++){
            for(int j = 0; j <= matrix[0].length-1; j++){
                System.out.print(matrix[i][j] + " ");
                if(j>0 && j%2 == 0){System.out.print("\n");}
            }
        }
    }
}

//The last step(swapping first column with last column) does not function
