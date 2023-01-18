import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class PersonProfile{
    protected String name, gender, dateOfBirth;

    public PersonProfile(){}

    public PersonProfile(String name, String gender, String dateOfBirth){
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Gender : " + this.gender);
        System.out.println("Date of Birth: " + this.dateOfBirth);
    }

}

class Student extends PersonProfile{
    private String courseList[][];          //#
    private String fileName;

    //CONSTRUCTOR: Student profile + file input name
    public Student(String name, String gender, String dateOfBirth, String fileName){
        super(name, gender, dateOfBirth);
        this.fileName = fileName;
        courseList = new String[countCourse(fileName)][5];      //#
        this.getCourse(fileName);                               //#
    }

    private void getCourse(String fileName){
        try{
            Scanner inputStream = new Scanner(new FileInputStream(fileName));
            while(inputStream.hasNextLine()){
                for(String[] course : courseList){
                    for(int j = 0; j<course.length; j++){
                        course[j] = inputStream.nextLine();
                    }
                }
            }
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("The file is not found");
        }catch (IOException e){
            System.out.println("Problem with file output");
        }
    }

    private int countCourse(String fileName) {
        int count = 0;
        try {
            Scanner inputStream = new Scanner(new FileInputStream((fileName)));
            while (inputStream.hasNextLine()) {
                for (int i = 0; i < 5; i++) {
                    inputStream.nextLine();
                }
                count++;
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
        return count;
    }

    //LIST OF COURSE NAME COURSE CODE
    public void displayCourseList(){
        System.out.println("---COURSE LIST---");
        for(int i = 0; i<courseList.length; i++){
            System.out.println("Course "+ (i+1) + " : ");
            for(int j = 0; j<courseList[i].length; j++){
                System.out.println(courseList[i][j]);
            }
        }
    }

    //MARK
    public void displayGrade(){
        System.out.println("--- GRADE ---");
        for(int i = 0; i<courseList.length; i++){
            String grade = "";
            if(Integer.parseInt(courseList[i][4]) >= 85){
                grade = "A";
            }else if (Integer.parseInt(courseList[i][4]) >= 75) {
                grade = "A-";
            } else if (Integer.parseInt(courseList[i][4]) >= 70) {
                grade = "B+";
            } else if (Integer.parseInt(courseList[i][4]) >= 65) {
                grade = "B";
            } else if (Integer.parseInt(courseList[i][4]) >= 60) {
                grade = "B-";
            } else if (Integer.parseInt(courseList[i][4]) >= 55) {
                grade = "C+";
            } else if (Integer.parseInt(courseList[i][4]) >= 50) {
                grade = "C";
            } else if (Integer.parseInt(courseList[i][4]) >= 45) {
                grade = "D";
            } else if (Integer.parseInt(courseList[i][4]) >= 35) {
                grade = "E";
            } else {
                grade = "F";
            }
            System.out.println("The grade for " + courseList[i][1] + " is " + grade);
        }
    }

    //SEMESTER
    //SESSION
}
public class Lab9 {
    public static void main(String[] args) {
        Student a = new Student("John", "Male", "31/20/2020", "course.txt");
        a.display();
        a.displayCourseList();
        a.displayGrade();
    }
}

