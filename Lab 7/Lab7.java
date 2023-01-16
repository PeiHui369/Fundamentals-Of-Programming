import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Lab7{
    public static void main(String[] args) {
        try {
                /*Write contents of Web page into a text file name index.htm*/
                PrintWriter out = new PrintWriter(new File("index.htm"));

                /*To read the contents of a Web page*/
                URL u = new URL("https://fsktm.um.edu.my");
                URLConnection cnn = u.openConnection();
                InputStream stream = cnn.getInputStream();
                Scanner in = new Scanner(stream);

                /*Write contents of Web page into a text file name index.htm*/
                while(in.hasNextLine()){
                    out.println(in.nextLine()); //While there is content read from the website, write it to the text file
                }
                out.close();

                /*Exception*/
                }
                catch (IOException e) {
                System.out.println("IO Error:" + e.getMessage());
        }
    }
}
