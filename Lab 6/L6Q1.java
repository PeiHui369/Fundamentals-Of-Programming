/*1. Write a Java method that returns a triangular number.
        A triangular number is defined as 1+2+3+…+ n.
        Then, write a Java program to use the method to display the first 20 triangular numbers*/

/*
A triangular number or triangle number counts objects arranged in an equilateral triangle.
Triangular numbers are a type of figurate number, other examples being square numbers and cube numbers. The nth triangular number is the number of dots in the triangular arrangement with n dots on each side, and is equal to the sum of the n natural numbers from 1 to n. The sequence of triangular numbers, starting with the 0th triangular number, is

0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 120, 136, 153, 171, 190, 210, 231, 253, 276, 300, 325, 351, 378, 406, 435, 465, 496, 528, 561, 595, 630, 666...
*/

public class L6Q1 {
    public static void main(String[] args){

        L6Q1 calc = new L6Q1();

        for(int i = 0; i<=20; i++){
            System.out.println(calc.triangularNumber(i));
        }
    }
    
    int triangularNumber(int n){
        return (n*(n+1))/2;
    }
}