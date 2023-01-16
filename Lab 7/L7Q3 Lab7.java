import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Lab7{
    public static void main(String[] args) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("fileName"));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("reverse.txt"));
            while(inputStream.hasNextLine()){
                reverse(inputStream.nextLine());
            }
            outputStream.close();
        } catch (FileNotFoundException e) {

        }catch (IOException e){
            System.out.println("IO Error" + e.getMessage());
        }
    }

    public static void reverse(String s){
        char[] ori = s.toCharArray();
        char[] reversed = new char[s.length()];
        for(int i = 0; i<ori.length; i++){
            reversed[i] = ori[ori.length-1-i];
        }

        for (int j = 0; j<reversed.length; j++){
            System.out.println(reversed[j]);
        }
    }
}
