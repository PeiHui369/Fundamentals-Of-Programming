import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Lab7{
    static String[] code ={"WXES1116", "WXES1115", "WXES1110", "WXES1112"};
    static String[] name = {"Programming I", "Data Structure", "Operating System", "Computing Mathematics I"};

    static boolean status = true;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the course code: ");
        String input = sc.next();
        displayCourseName(input);
    }

    public static void storeTable(String[] args)throws Exception{
        /* store the table in a binary file name coursename.dat */
        FileOutputStream fileOutputStream = new FileOutputStream("coursename.dat");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        for(int i = 0; i<code.length; i++){
            dataOutputStream.writeUTF(code[i]);
            dataOutputStream.writeUTF(name[i]);
        }
        dataOutputStream.close();
    }

    public static void displayCourseName(String input)throws Exception{
        FileInputStream fileInputStream = new FileInputStream("coursename.dat");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        while(true){
            if(input.equals(dataInputStream.readUTF())){
                System.out.println("Course Code: " + input);
                System.out.println("Course Name: " + dataInputStream.readUTF());
                status = true;
                break;
            }else{
                dataInputStream.readUTF();
            }
        }}
    }

